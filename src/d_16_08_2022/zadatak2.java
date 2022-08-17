package d_16_08_2022;

public class zadatak2 {

	public static void main(String[] args) {
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
		SmartAirConditioning klima1 = new SmartAirConditioning ();
		
		klima1.marka = "Tesla";
		klima1.temperatura = 24.5;
		klima1.mod = "hladi";
		klima1.stampa();
		
		String y = klima1.informacija(25.0);
		System.out.println(y);
		
		
		SmartAirConditioning klima2 = new SmartAirConditioning ();
		
		klima2.marka = "Samsung";
		klima2.temperatura = 26.0;
		klima2.mod = "greje";
		
		klima2.stampa();
		
		String z = klima2.informacija(3.5);
		System.out.println(z);
		
		
	}

}
