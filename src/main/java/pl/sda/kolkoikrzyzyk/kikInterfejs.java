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
		System.out.println("Podaj swoje imię:");
		Scanner scanner = new Scanner(System.in);
		String imie = scanner.nextLine();
		return imie;

	}

	public int podajPole(String imie) {

		System.out.println("\n"+"Gracz :" + imie);
		System.out.println("Podaj numer pola: ");
		Scanner scanner = new Scanner(System.in);
		String check = scanner.nextLine();
		boolean flaga = true;
		while(flaga){
			
		try{
			  int num = Integer.parseInt(check);
			  if(Integer.parseInt(check) < 1 || Integer.parseInt(check)> 9 )
			  {System.out.println("Podano liczb spoza zakresu 1-9. Spróbuj jeszcze raz.");
				
				check = scanner.nextLine();}else{
			  flaga=false;}
			} catch (NumberFormatException e) {
				System.out.println("Podaj liczbę. Spróbuj jeszcze raz.");
				
				check = scanner.nextLine();
				}
		}
		int pozycja = Integer.parseInt(check);
		return pozycja;

	}

	public void pokazPlansze(Plansza plansza) {
		System.out.println(plansza.toString());
	}

	public void podanoNiepoprawnePole() {
		System.out.println("Podano niepoprawne pole. Spróbuj jeszcze raz.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

	public void wygranoGre(String imie) {
		System.out.println("Brawo " + imie + " wygrałeś grę! \n");
		//Scanner scanner = new Scanner(System.in);
		//scanner.nextLine();
	}
	
	public  void zremisowano() {
		
		System.out.println("Remis");
	}
	
	public  void stanGry(String imieGracza1, String imieGracza2, int wynikGracza1, 
			int wynikGracza2, int iloscGier){
		System.out.println("Aktualny wynik "+imieGracza1+ ": "+wynikGracza1);
		System.out.println("Aktualny wynik "+imieGracza2+ ": "+wynikGracza2);
		System.out.println("Rozegrano: "+iloscGier+"\n"+"\n");
	}
	
	public void wygrana(String imieGracza) {
		
		System.out.println("Brawo! Pierwszym graczem, który wygrał 3 gry, jest: "+imieGracza);
		
	}
}
