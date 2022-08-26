package d_25_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ispit prvi = new Ispit("Mehanika", 8, "Jovan Jovanovic");
		Ispit drugi = new Ispit("Matematika", 9, "Jana Jankovic");
		Ispit treci = new Ispit("Hemija", 7, "Pera Peric");
		prvi.print();
		drugi.print();
		treci.print();
		
		Student jedan = new Student(2233, "Natasa Lazarevvic", "osnovne");
		jedan.dodajIspit(prvi);
		jedan.dodajIspit(drugi);
		jedan.dodajIspit(treci);
		jedan.prosecnaOcena();
		jedan.stampa();
		
		
		
		

	}

}
