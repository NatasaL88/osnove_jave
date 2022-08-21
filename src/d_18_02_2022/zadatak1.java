package d_18_02_2022;

public class zadatak1 {

	public static void main(String[] args) {
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku
//		od definisanih funkcija.
		
		Proizvod patike = new Proizvod();
		patike.naziv = "Nike";
		patike.cena = 3590.00;
		patike.tezina = 350.50;
		
		patike.stampa();
		patike.povecajCenu(1000);
		System.out.println("Povecana cena je: " + patike.cena);
		double novaCena = patike.vratiCenuSaPopustom(50);
		System.out.println("Cena sa popustom je" + novaCena);
		int postarina = patike.racunajPostarinu();
		System.out.println("Postarina je: " + postarina);

		
		Proizvod tv = new Proizvod();
		tv.naziv = "Samsung";
		tv.cena = 35500.00;
		tv.tezina = 6500.00;
		
		tv.stampa();
		tv.povecajCenu(2000);
		System.out.println("Povecana cena je: " + tv.cena);
		double snizenaCena = tv.vratiCenuSaPopustom(10);
		System.out.println("Snizena cena je: " + snizenaCena);
		int iznosPostarine = tv.racunajPostarinu();
		System.out.println("Postarina je: " + iznosPostarine);
		
		
		
}

}
