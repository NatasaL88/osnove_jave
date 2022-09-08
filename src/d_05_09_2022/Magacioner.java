package d_05_09_2022;

public class Magacioner extends Radnik {

	public Magacioner(String imePrezime) {
		super(imePrezime);
	
	}
	
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	
	double sumaSektora = 0;
	double prosecnaPlata = 0;
	
	private double prosecnaPlata() {
		for (int i = 0; i < this.niz.size(); i++) {
			sumaSektora += this.niz.get(i).getPlata();
			prosecnaPlata = sumaSektora / this.niz.size() * 0.5;
		}
		return prosecnaPlata;
	}

	@Override
	public double plata() {
		return this.prosecnaPlata * this.niz.size();
	
	}

}
