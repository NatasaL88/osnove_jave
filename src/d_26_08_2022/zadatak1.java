package d_26_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Igrac jedan = new Igrac("Nemanja Djordjevic", "4546242434", 1979, 33, "levi bek", true);
		Igrac dva = new Igrac("Ivan Lazarevic", "765865865765", 1984, 11, "desni bek", false);
		jedan.print();
		dva.print();
		
		Trener prvi = new Trener("Jovan Jovanovic", "4543676", 1972, 2, "pomocni");
		Trener drugi = new Trener("MIlan Milanovic", "7648976545", 1970, 22, "glavni");
		prvi.print();
		drugi.print();

	}

}
