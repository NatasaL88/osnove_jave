package d_23_08_2022;

public class Transakcija {
//	id transakcije
//	racun sa kog se prenose sredstva
//	racun na koji se prenose sredstva
//	gettere i settere
//	konstruktore
	
	private String idTransakcije;
	private Racun prenosilac;
	private Racun primalac;
	
	public Transakcija(String idTransakcije) {
		this.idTransakcije = idTransakcije;
	}
	
	public String getIdTransakcije() {
		return idTransakcije;
	}
		public Racun getPrenosilac() {
		return prenosilac;
	}
	public void setPrenosilac(Racun prenosilac) {
		this.prenosilac = prenosilac;
	}
	public Racun getPrimalac() {
		return primalac;
	}
	public void setPrimalac(Racun primalac) {
		primalac = primalac;
	}
	
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja
//		visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
	
	private double provizija(double iznos) {
		if(iznos < 4500.00) {
			return 45.00;
		}else {
			return iznos * 0.01;
		}
	}
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi
//	vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).

	public void izvrsiTransakciju(double iznos) {
		if(prenosilac.getTrenutnoStanje() > iznos + this.provizija(iznos)) {
			double novoStanjePrenosilac = prenosilac.getTrenutnoStanje() - iznos - this.provizija(iznos);
			double novoStanjePrimalac = primalac.getTrenutnoStanje() + iznos;
		}
	}
	
//	metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna

	public void print() {
		System.out.println(this.idTransakcije);
		System.out.println("Racun sa: " + prenosilac.getImePrezime() + " - " + prenosilac.getBrRacuna());
		System.out.println("Racun na: " + primalac.getImePrezime() + " - " + primalac.getBrRacuna());
		
	}

	


}
