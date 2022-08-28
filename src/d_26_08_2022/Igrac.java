package d_26_08_2022;

public class Igrac extends Osoba{
	
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
	
	private int brojNosi;
	private String pozicija;
	private boolean kapiten;
	
	public Igrac(String imeprezime, String jmbg, int godinaRodjenja, int brojNosi, String pozicija, boolean kapiten) {
		super(imeprezime, jmbg, godinaRodjenja);
		this.brojNosi = brojNosi;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrojNosi() {
		return brojNosi;
	}

	public void setBrojNosi(int brojNosi) {
		this.brojNosi = brojNosi;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.brojNosi +", " + this.pozicija +", " + this.kapiten);
	}

	
	
	
	
	


}
