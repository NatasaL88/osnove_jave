package d_06_09_2022;

public class Tetrapak extends Ambalaza {
	
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni

		private boolean recikliranje;
		private double osnovnaCena;
		
		
		
		
		
			public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,boolean recikliranje, double osnovnaCena) {
			super(barkod, nazivArtikla, netoTezina, brutoTezina);
			this.recikliranje = recikliranje;
			this.osnovnaCena = osnovnaCena;
		}
		
		
		
		public boolean isRecikliranje() {
			return recikliranje;
		}
		public void setRecikliranje(boolean recikliranje) {
			this.recikliranje = recikliranje;
		}
		public double getOsnovnaCena() {
			return osnovnaCena;
		}
		public void setOsnovnaCena(double osnovnaCena) {
			this.osnovnaCena = osnovnaCena;
		}
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena

		@Override
		public double cenaArtikla() {
			if(this.recikliranje == true) {
			return  this.sracunajTezinu() * 1.5 + this.osnovnaCena;
			}
			else {
				return this.osnovnaCena;
			}
			
		}
		
//		metoda stampaj stampa sve podatke iz klase tetrapak.

		@Override
		public void print() {
			System.out.print("Naziv artikla: " + this.nazivArtikla + ", tezina: ");
			System.out.print( + this.sracunajTezinu() + " barkod, " + this.barkod + ", cena artikla iznosi: " + this.cenaArtikla());
				
		}
		

		
	
	
	
	

}
