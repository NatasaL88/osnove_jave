package d_23_08_2022;

public class ZeleniKarton {
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
	
	private String imePrezime;
	private String brIndeksa;
	private String nazivPredmeta;
	private String imePrezimeProf;
	private int ocena;
	
	
	public ZeleniKarton(String imePrezime, String brIndeksa) {
		this.imePrezime = imePrezime;
		this.brIndeksa = brIndeksa;
		
	}
	public String getImePrezime() {
		return imePrezime;
		
	}

	
	public String getBrIndeksa() {
		return brIndeksa;
	}
	
	
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getImePrezimeProf() {
		return imePrezimeProf;
	}
	public void setImePrezimeProf(String imePrezimeProf) {
		this.imePrezimeProf = imePrezimeProf;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
	
	public boolean polozio() {
		if(this.ocena != 5) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
	
	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imePrezime + ", " + this.brIndeksa);
		System.out.println("Profesor: " + this.imePrezimeProf);
	}


	


}
