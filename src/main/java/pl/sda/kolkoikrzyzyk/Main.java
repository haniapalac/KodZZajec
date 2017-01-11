package pl.sda.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		kikInterfejs kikInterfejs = new kikInterfejs();
		Plansza plansza = new Plansza();
		int menu = kikInterfejs.menu();

		Map<String, String> mapaGraczy = new HashMap<>();
		String gracz1 = kikInterfejs.podajImie();
		String gracz2 = kikInterfejs.podajImie();
		mapaGraczy.put(gracz1, "X");
		mapaGraczy.put(gracz2, "O");

		for (int i = 0; i < 9; i++) {
			kikInterfejs.pokazPlansze(plansza);
			boolean czyWstawiono;
			String aktualnyGracz = null;
			String wstawionyZnak = null;
			if (i % 2 == 0) {
				aktualnyGracz = gracz1;

			} else {
				aktualnyGracz = gracz2;

			}
			wstawionyZnak = mapaGraczy.get(aktualnyGracz);
			do {
				int pozycja = kikInterfejs.podajPole(aktualnyGracz);
				czyWstawiono = plansza.wstawZnak(wstawionyZnak, pozycja);
				if (!czyWstawiono) {
					kikInterfejs.podanoNiepoprawnePole();

				}
			} while (!czyWstawiono);
		}
		kikInterfejs.pokazPlansze(plansza);

	}

}
