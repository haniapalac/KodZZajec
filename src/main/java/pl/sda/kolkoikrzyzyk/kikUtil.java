package pl.sda.kolkoikrzyzyk;

public class kikUtil { // klasy, które są w jakiś sposób użyteczne

	public static boolean isDigit(String text) {
		// można też zrobic to z użyciem Integer i wyjątków
		char tablica[] = text.toCharArray();
		// char[] chars2 = new char[chars.length];
		if (tablica.length > 1) {
			return false;
		}
		char znak = tablica[0];
		if (znak > 48 && znak < 58) {
			return true;
		}
		return false;

	}

	public static boolean sprawdzWiersze(Plansza plansza) {
		String[] pola = plansza.getPola();
		for (int i = 0; i < 9; i += 3) {
			String wzor = plansza.getPola()[i];
			if (wzor.equals(pola[i + 1]) && wzor.equals(pola[i + 2])) {
				return true;
			}
		}

		return false;

	}

	public static boolean sprawdzKolumny(Plansza plansza) {
		String[] pola = plansza.getPola();
		for (int i = 0; i < 3; i++) {
			String wzor = pola[i];
			if (wzor.equals(pola[i + 3]) && wzor.equals(pola[i + 6])) {
				return true;
			}
		}
		return false;

	}

	public static boolean sprawdzPrzekatne(Plansza plansza) {
		String[] pola = plansza.getPola();
		String wzor = pola[4];
		boolean naPierwszejPrzekatnej = wzor.equals(pola[0]) && wzor.equals(pola[8]);
		boolean naDrugiejPrzekatnej = wzor.equals(pola[2]) && wzor.equals(pola[6]);
		if (naPierwszejPrzekatnej || naDrugiejPrzekatnej) {
			return true;
		}
		return false;

	}

	public static boolean czyZakonczonoGre(Plansza plansza) {
		
		return sprawdzWiersze(plansza) || sprawdzKolumny(plansza) || sprawdzPrzekatne(plansza);
	}
	

}
