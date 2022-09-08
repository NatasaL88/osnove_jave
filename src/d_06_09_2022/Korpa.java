package d_06_09_2022;

import java.util.ArrayList;

public class Korpa {

//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti

	private ArrayList<Ambalaza> gajba = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		gajba.add(ambalaza);

	}
	public Korpa() {
		
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < gajba.size(); i++) {
			if (gajba.get(i).getBarkod().equals(barkod)) {
				this.gajba.remove(this.gajba.get(i));

			}

		}
	}

//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.

	private double ukupnaCena(int popust) {
		double zbirnaCena = 0;
		for (int i = 0; i < gajba.size(); i++) {
			zbirnaCena += gajba.get(i).cenaArtikla();

		}
		return zbirnaCena;

	}

//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//	kao parametar funkcije se prima Super karticu iz koje se cita popust.
	
	
	public double ukupnaCenaKorpe(SuperKartica maxi) {
		return this.ukupnaCena(maxi.getPopust());
		
	}
	
	
	
	
	
	

}
