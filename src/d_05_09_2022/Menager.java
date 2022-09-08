package d_05_09_2022;

public class Menager extends Radnik {

	public Menager(String imePrezime) {
		super(imePrezime);
		
	}

	double plata = 0;
	@Override
	public double plata() {
		for (int i = 0; i < this.niz.size(); i++) {
			this.plata += this.niz.get(i).getPlata();
			
			
		}
		return plata;
	}
	
//	override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.



}
