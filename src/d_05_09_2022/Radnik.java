package d_05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

		protected String imePrezime;
		protected ArrayList<Sektor> niz = new ArrayList<Sektor>();
		
		public Radnik(String imePrezime) {
			this.imePrezime = imePrezime;
			
		}

		public String getImePrezime() {
			return imePrezime;
		}

		public void setImePrezime(String imePrezime) {
			this.imePrezime = imePrezime;
		}

		public ArrayList<Sektor> getNiz() {
			return niz;
		}

		public void setNiz(ArrayList<Sektor> niz) {
			this.niz = niz;
		}
		
		
		public abstract double plata();
		
		
		public void zaposli(Sektor sektor) {
			this.niz.add(sektor);
		}
		

}
