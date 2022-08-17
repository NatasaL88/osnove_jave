package d_16_08_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu 
//		atribut za mod (hladi/greje) - string
	
	public String marka;
	public double temperatura;
	public String mod;
	
//	metodu za stampu (proizvoljno)
	
	public void stampa() {
		System.out.println("Klima je " + this.marka + ", podesena je na " + this.temperatura +
				" strpeni, i trenutno je u modu da " + this.mod);	
	}
	
//	metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar
//	prima temperaturu koja je napolju.
	
	public String informacija(double temperaturaNapolju) {
		if(this.temperatura < temperaturaNapolju) {
			return "Napolju je veca temperatura";
		}
		else if(this.temperatura > temperaturaNapolju) {
			return "napolju je manja temperatura";
		}
		else {
			return "ista je temperatura";
		}
	}



}
