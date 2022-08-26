package d_25_08_2022;

public class Ispit {
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
	
	private String nazivIspita;
	private int ocena;
	private String imeProf;
	public Ispit(String nazivIspita, int ocena, String imeProf) {
		this.nazivIspita = nazivIspita;
		this.ocena = ocena;
		this.imeProf = imeProf;
	}
	public String getNazivIspita() {
		return nazivIspita;
	}
	public void setNazivIspita(String nazivIspita) {
		this.nazivIspita = nazivIspita;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getImeProf() {
		return imeProf;
	}
	public void setImeProf(String imeProf) {
		this.imeProf = imeProf;
	}
	
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
	
	public boolean polozio() {
		if(this.ocena != 5) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)
	
	public void print() {
		System.out.println(this.nazivIspita + " - " + this.imeProf + " - " + this.ocena);
	}


	
	


}
