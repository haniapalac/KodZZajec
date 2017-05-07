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
		int wynikGracza1 = 0;
		int wynikGracza2 = 0;
		int iloscGier = 0;
		String aktualnyGracz = null;
		String aktualnyGracz1 = gracz1;
		String aktualnyGracz2 = gracz2;
		
		
			
			 
	
		while(wynikGracza1<3 && wynikGracza2 <3) {
		
		for (int i = 0; i < 9; i++) {
			
			kikInterfejs.pokazPlansze(plansza);
			boolean czyWstawiono;
			
			String wstawionyZnak = null;
			if (i % 2 == 0) {
				aktualnyGracz = aktualnyGracz1;

			} else {
				aktualnyGracz = aktualnyGracz2;

			}
			wstawionyZnak = mapaGraczy.get(aktualnyGracz);

			do {
				int pozycja = kikInterfejs.podajPole(aktualnyGracz);
				czyWstawiono = plansza.wstawZnak(wstawionyZnak, pozycja);
				if (!czyWstawiono) {
					kikInterfejs.podanoNiepoprawnePole();

				}
			} while (!czyWstawiono);
			if (kikUtil.czyZakonczonoGre(plansza)) {
				kikInterfejs.wygranoGre(aktualnyGracz);
				if(aktualnyGracz==gracz1) {
					wynikGracza1++;
				} else {
					wynikGracza2++;
				}
				break;
			}
			if (i == 8){
				kikInterfejs.zremisowano();
			}
			
		}
		
		
            

		kikInterfejs.pokazPlansze(plansza);
		if (aktualnyGracz == gracz1) {
			aktualnyGracz1 = gracz2;
			aktualnyGracz2 = gracz1;
		}else{aktualnyGracz1 = gracz1;
		aktualnyGracz2 = gracz2;}
		iloscGier++;
		kikInterfejs.stanGry(gracz1, gracz2, wynikGracza1, wynikGracza2, iloscGier);
		plansza = new Plansza();
		
		}
		if(wynikGracza1==3){
		kikInterfejs.wygrana(gracz1);
		}else{
		kikInterfejs.wygrana(gracz2);
		}
		
		for (int i = 0; i < iloscGier; i++) {
			   for (int j = 0; j < iloscGier - i; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
			   try {

					//sleep 5 seconds
					Thread.sleep(500);

					

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  }
	

		
	}

}
