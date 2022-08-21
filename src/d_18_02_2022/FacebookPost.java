package d_18_02_2022;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da
//				postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
	
	public String imePrezime;
	public String imeProfil;
	public String tekstObjave;
	public int brojLajkova;
	public int brojDeljenja;
	
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
	
	public void print() {
		System.out.println(this.imePrezime + " >>> " + this.imeProfil);
		System.out.println(this.tekstObjave);
		System.out.println("Likes " + this.brojLajkova + "| Shares " + this.brojDeljenja);
	}
	
	
	
	



}
