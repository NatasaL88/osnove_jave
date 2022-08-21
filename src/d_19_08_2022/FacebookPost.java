package d_19_08_2022;

public class FacebookPost {
	
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
	
	private String imePrezime;
	private String imeObjava;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;
	
//	difoltni konstuktor
	
	public FacebookPost() {
		
	}
	
//	konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je
//	profilu objavnljen i tekst objave
	
	public FacebookPost (String imePrezime, String imeObjava, String tekst) {
		this.imePrezime = imePrezime;
		this.imeObjava = imeObjava;
		this.tekst =tekst;
	}
	
//	like(), koja povecava broj lajkova za 1.
	
	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}
	
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
	
	public void dislike() {
		
		if(this.brojLajkova >= 1) {
			this.brojLajkova = this.brojLajkova - 1;
		} else {
			this.brojLajkova = 0;
		}
	}
	
//	share(), koja povecava broj deljenja za 1
	
	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}
	
//	print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
	public void print() {
		System.out.println(this.imePrezime + " >>> " + this.imeObjava);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.brojLajkova + "| Shares " + this.brojDeljenja);
	}
	
	


}
