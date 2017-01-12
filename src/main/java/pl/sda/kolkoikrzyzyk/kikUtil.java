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

}
