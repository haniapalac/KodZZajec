package pl.sda.kolkoikrzyzyk;

public class Main {

	public static void main(String[] args) {

		kikInterfejs kikInterfejs = new kikInterfejs();
		Plansza plansza = new Plansza();
		int menu = kikInterfejs.menu();
		String gracz1 = kikInterfejs.podajImie();
		String gracz2 = kikInterfejs.podajImie();

		for (int i = 0; i < 10; i++) {
			int pozycja = kikInterfejs.podajPole(gracz1);
			boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
			System.out.println(plansza.toString());
			pozycja = kikInterfejs.podajPole(gracz2);
			czyWstawiono = plansza.wstawZnak("O", pozycja);
			System.out.println(plansza.toString());
		}

		// kikInterfejs.podajPole(gracz2);

	}

}
