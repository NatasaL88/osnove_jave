package d_25_08_2022;

import java.util.ArrayList;

public class Student {
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta

		private int brIndeksa;;
		private String imePrezime;
		private String tip;
		private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
		
		public Student(int brIndeksa, String imePrezime, String tip) {
			this.brIndeksa = brIndeksa;
			this.imePrezime = imePrezime;
			this.tip = tip;
		}

		public int getBrIndeksa() {
			return brIndeksa;
		}

		public void setBrIndeksa(int brIndeksa) {
			this.brIndeksa = brIndeksa;
		}

		public String getImePrezime() {
			return imePrezime;
		}

		public void setImePrezime(String imePrezime) {
			this.imePrezime = imePrezime;
		}

		public String getTip() {
			return tip;
		}

		public void setTip(String tip) {
			this.tip = tip;
		}

		public ArrayList<Ispit> getIspiti() {
			return ispiti;
		}
		
		
//		metodu dodaj ispit u niz ispita
		
		public void dodajIspit(Ispit ispit) {
			this.ispiti.add(ispit);
			
		}

//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
		
		public double prosecnaOcena() {
			double prosek = 0.0;
			double suma = 0;
			int brojPolozenih = 0;
			for(int i = 0; i < ispiti.size(); i++) {
				if(ispiti.get(i).getOcena() !=5) {
					brojPolozenih ++;
					suma = suma + ispiti.get(i).getOcena();
					
				}
				prosek = suma / brojPolozenih;
			}
			return prosek;
			
		}
		
//		metodu stampaj koja stampa u formatu:
//			(broj indeksa) - (ime i prezime) - (tip studija)
//			Predmeti:
//			(naziv predmeta) - (profesor) - (ocena)
//			(naziv predmeta) - (profesor) - (ocena)
//			(naziv predmeta) - (profesor) - (ocena)
//			Prosecna ocena: (prosecna ocena)
		
		public void stampa() {
			System.out.println(this.brIndeksa + " - " + this.imePrezime + " - " + this.tip);
			System.out.println("Predmeti:");
			for(int i = 0; i < ispiti.size(); i++) {
				this.ispiti.get(i).print();}
				System.out.println("Prosecna ocena je: " + this.prosecnaOcena());	
			
		}
		
}
