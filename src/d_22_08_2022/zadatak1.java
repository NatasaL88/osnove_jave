package d_22_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor prvi = new Autor("Aleksandra", "Mihajlovic");
		prvi.print();
		
		Autor drugi = new Autor();
		drugi.setIme("Gijom");
		drugi.setPrezime("Muso");
		drugi.print();
		
		Knjiga jedan = new Knjiga("56787-847-484", "Kroz prstohvat cimeta", 2021, prvi);
		jedan.print();
		
		Knjiga dva = new Knjiga();
		dva.setNaziv("Tajni zivot pisaca");
		dva.setGodinaIzdanja(2012);
		dva.setISBN("456-78658-76");
		dva.setAutor(drugi);
		dva.print();
		
	}

}
