package d_06_09_2022;

public class zadatakAmbalaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		Korpa kupovina = new Korpa();
		Tetrapak mali = new Tetrapak("565676565=897", "coko-mleko", 222, 333, true, 55);
		Tetrapak veliki = new Tetrapak("8745-654645", "Jogurt", 400, 800, false, 135);
		StaklenaAmbalaza flasa = new StaklenaAmbalaza("767-888", "flasa za sok", 200, 500, 35, true, 66);
		StaklenaAmbalaza balon = new StaklenaAmbalaza("4875845", "balon za rakiju", 1250, 5500, 200, false, 10000);
		SuperKartica maxi = new SuperKartica("444555", "Natasa Lazarevic", 100);
		
		
		kupovina.dodajAmbalazu(mali);
		kupovina.dodajAmbalazu(veliki);
		kupovina.dodajAmbalazu(flasa);
		kupovina.dodajAmbalazu(balon);
		
		kupovina.izbaciAmbalazu(mali.getBarkod());
		kupovina.ukupnaCenaKorpe(maxi);
		System.out.print("Ukupna cena sa popustom je: " + kupovina.ukupnaCenaKorpe(maxi));
		
		
		
		
		
		
		
				}
	

}
