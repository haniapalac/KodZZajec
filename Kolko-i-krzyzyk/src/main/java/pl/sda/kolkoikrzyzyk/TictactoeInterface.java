package pl.sda.kolkoikrzyzyk;

import java.util.Scanner;

public class TictactoeInterface {

	public int menu() {

		System.out.println("1. Start");
		System.out.println("0. Koniec");
		Scanner scanner = new Scanner(System.in);
		int reply = scanner.nextInt();
		return reply;
	}

	public String enterName() {
		System.out.println("Podaj swoje imię:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		return name;

	}

	public int enterField(String name) {

		System.out.println("\n" + "Gracz :" + name);
		System.out.println("Podaj numer pola: ");
		Scanner scanner = new Scanner(System.in);
		String check = scanner.nextLine();
		boolean flag = true;
		while (flag) {

			try {
				int num = Integer.parseInt(check);
				if (Integer.parseInt(check) < 1 || Integer.parseInt(check) > 9) {
					System.out.println("Podano liczb spoza zakresu 1-9. Spróbuj jeszcze raz.");
					check = scanner.nextLine();
				} else {
					flag = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Podaj liczbę. Spróbuj jeszcze raz.");
				check = scanner.nextLine();
			}
		}
		int position = Integer.parseInt(check);
		return position;

	}

	public void showBoard(Board board) {
		System.out.println(board.toString());
	}

	public void incorrectField() {
		System.out.println("Podano niepoprawne pole. Spróbuj jeszcze raz.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

	public void gameWon(String name) {
		System.out.println("Brawo " + name + " wygrałeś grę! \n");
	}

	public void tie() {
		System.out.println("Remis");
	}

	public void gameResult(String player1name, String player2name, int player1result, int player2result,
			int numberOfGamesPlayed) {
		System.out.println("Aktualny wynik " + player1name + ": " + player1result);
		System.out.println("Aktualny wynik " + player2name + ": " + player2result);
		System.out.println("Rozegrano: " + numberOfGamesPlayed + "\n" + "\n");
	}

	public void won(String playerName) {
		System.out.println("Brawo! Pierwszym graczem, który wygrał 3 gry, jest: " + playerName);
	}
}
