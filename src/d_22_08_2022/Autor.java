package d_22_08_2022;

public class Autor {
//	ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
	
	private String ime;
	private String prezime;
	
	public Autor() {
		
	}
	
	public Autor(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
//	-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)

	public void print() {
		System.out.println(this.ime + "  " + this.prezime);
		
	}
	
	
	

}
