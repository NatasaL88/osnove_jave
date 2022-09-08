package d_06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
	
	private double kaucija;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;
	
	
	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	
	public double getKaucija() {
		return kaucija;
	}


	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}


	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}


	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}


	public double getOsnovnaCena() {
		return osnovnaCena;
	}


	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2

	@Override
	public double cenaArtikla() {
		if(this.daLiSePlacaKaucija == true) {
			return this.osnovnaCena * 1.2 * this.kaucija;
		}else {
		return this.osnovnaCena * 1.2;
	}
	}
	
	@Override
	public void print() {
		System.out.println("Naziv artikla je: " + this.nazivArtikla + ", barkod: " + this.barkod + ", tezina iznosi: " + this.sracunajTezinu());
		System.out.println("Cena artikla je: " + this.cenaArtikla());
	}
	
	
	

}
