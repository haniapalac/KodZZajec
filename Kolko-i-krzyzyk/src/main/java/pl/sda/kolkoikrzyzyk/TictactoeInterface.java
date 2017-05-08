package pl.sda.kolkoikrzyzyk;

import java.util.Scanner;

public class TictactoeInterface {

	public String menu() {

		System.out.println("Aby rozpocząć grę KÓŁKO I KRZYŻYK, wprowadź dowolny znak.");
		System.out.println("Grasz do trzech wygranych. Powodzenia!");
		Scanner scanner = new Scanner(System.in);
		String reply = scanner.nextLine();
		return reply;
	}

	public String enterName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		return name;
	}

	public int enterField(String name) {

		System.out.println("\n" + "Gracz: " + name);
		System.out.println("Podaj numer pola: ");
		Scanner scanner = new Scanner(System.in);
		String check = scanner.nextLine();
		boolean flag = true;
		while (flag) {

			try {
				int num = Integer.parseInt(check);
				if (Integer.parseInt(check) < 1 || Integer.parseInt(check) > 9) {
					System.out.println("Podałeś liczbę spoza zakresu 1-9. Spróbuj jeszcze raz.");
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
		System.out.println("Podałeś niepoprawne pole. Spróbuj jeszcze raz.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

	public void gameWon(String name) {
		System.out.println("Brawo " + name + " wygrałeś grę! \n");
	}

	public void tie() {
		System.out.println("Remis");
	}

	public void gameResult(Result result1, Result result2,
			int numberOfGamesPlayed) {
		System.out.println("Aktualny wynik " + result1.getPlayerName() + ": " + result1.getResult());
		System.out.println("Aktualny wynik " + result2.getPlayerName() + ": " + result2.getResult());
		System.out.println("Rozegrano: " + numberOfGamesPlayed + "\n" + "\n");
	}

	public void won(String playerName) {
		System.out.println("Brawo! Pierwszym graczem, który wygrał 3 gry, jest: " + playerName);
	}
}
