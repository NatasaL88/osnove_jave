package d_23_08_2022;

public class Racun {
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu

	private String brRacuna;
	private String imePrezime;
	private double trenutnoStanje;
	
	public Racun(double trenutnoStanje) {
		this.trenutnoStanje = trenutnoStanje;
	}
	
	public String getBrRacuna() {
		return brRacuna;
	}
	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)

	public void promenjenoStanje (double vrednost) {
		if(this.trenutnoStanje > vrednost) {
			this.trenutnoStanje = this.trenutnoStanje - vrednost;
		} else {
			this.trenutnoStanje = 0.0;
		}
		
	}
	
//	metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd

	public void print() {
		System.out.println(this.imePrezime + " - " + this.brRacuna);
		System.out.println("Stanje na racunu je: " + this.trenutnoStanje + " rsd.");
	}
	
	
	
	
	
	
}
