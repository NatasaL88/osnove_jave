package d_06_09_2022;

public class SuperKartica {

//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	
	
	private String brKartice;
	private String ImeVlasnika;
	private int popust;
	
	public SuperKartica() {
		
	}

	public SuperKartica(String brKartice, String imeVlasnika, int popust) {
		this.brKartice = brKartice;
		this.ImeVlasnika = imeVlasnika;
		this.popust = popust;
	}

	public String getBrKartice() {
		return brKartice;
	}

	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}

	public String getImeVlasnika() {
		return ImeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		ImeVlasnika = imeVlasnika;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void print() {
		System.out.println("Broj kartice je: " + this.brKartice + ", vlasnik je : " + this.ImeVlasnika);
	}
	
}	
