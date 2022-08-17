package d_16_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
		
		Proizvod cokolada = new Proizvod();
		
		cokolada.naziv = "Bela cokolada";
		cokolada.cena = 130.55;
		cokolada.tezina = 275;
			cokolada.stampaj();
			double x = cokolada.konvertuj("kg");
			System.out.println("Tezina je: " + x +"kg.");
			
			
		Proizvod auto = new Proizvod();
		
		auto.naziv = "Audi";
		auto.cena = 2345.44;
		auto.tezina = 247457.66;
			auto.stampaj();
			double y = auto.konvertuj("t");
			System.out.println("Tezina je: " + y + "t.");
		
				
		
			
			
		
		

	}

}
