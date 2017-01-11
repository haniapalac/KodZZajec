package pl.sda.kolkoikrzyzyk;

import java.util.Scanner;

public class kikInterfejs {

	public int menu() {

		// Scanner scanner = new Scanner(System.in);
		System.out.println("1. Start");
		System.out.println("0. Koniec");
		Scanner scanner = new Scanner(System.in);
		int odpowiedz = scanner.nextInt();
		return odpowiedz;
	}

	public String podajImie() {
		System.out.println("Podaj swoje imię");
		Scanner scanner = new Scanner(System.in);
		String imie = scanner.nextLine();
		return imie;

	}

	public int podajPole(String imie) {

		System.out.println("gracz :" + imie + ":");
		System.out.println("podaj numer pola:");
		Scanner scanner = new Scanner(System.in);
		int pozycja = scanner.nextInt();
		return pozycja;

	}

	public void start() {

	}

	public void koniec() {

	}
}
