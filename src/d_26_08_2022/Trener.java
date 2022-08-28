package d_26_08_2022;

public class Trener extends Osoba {
//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
	
	public int godineIskustva;
	public String tipTrenera;
	
	public Trener() {
		
	}
	
	public Trener(String imeprezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imeprezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
	
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.godineIskustva + ", " + this.tipTrenera);
		
	}

}
