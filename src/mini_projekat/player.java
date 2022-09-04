package mini_projekat;

public class player {
//	ime i prezime
//	gettere i settere
//	konstuktore
//	metodu print, koja stampa ime i prezime igraca
	
	private String imePrezime;
	
	
	public player() {
		
	}

	public player(String imePrezime) {
	this.imePrezime = imePrezime;
}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
		
	public void print() {
		System.out.println("Ime i prezime igraca: " + this.imePrezime);
	}
	


}
