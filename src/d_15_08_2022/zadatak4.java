package d_15_08_2022;

public class zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

		licniPodaci("408988735023", "Natasa", "Lazarevic", 1988, true);
		
		
	}
	public static void licniPodaci(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rojenja: " + godinaRodjenja);
		System.out.println("Aktivan: " + aktivan);
	}

}