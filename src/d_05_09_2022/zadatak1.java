package d_05_09_2022;

public class zadatak1 {

	public static void main(String[] args) {
		
		
		Radnik menadzer = new Menager("Natasa Lazarevic");
		Radnik magacioner = new Magacioner("Nemanja Djoredjevic");
		
		Sektor jedan = new Sektor("Prodaja", 50000.00);
		Sektor dva = new Sektor("Sivenje", 30000.00);
		
		
		menadzer.zaposli(jedan);
		
		magacioner.zaposli(dva);
	

			System.out.println(menadzer.getImePrezime() + ", ima platu: " + menadzer.plata());
			System.out.println(magacioner.getImePrezime() + ", ima platu: " + magacioner.plata());
	}

}
