package d_16_08_2022;

public class Proizvod {
	
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
	
	public String naziv;
	public double cena;
	public double tezina;
	
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
	
	public void stampaj() {
		System.out.println("{{" + this.naziv + "}}, {{" + this.cena + "}}, {{" + this.tezina + "}}");
	}
	
//	konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//	a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//	Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
	
	public double konvertuj(String jedinica) {
		if(jedinica.equals("kg")) {
			double sracunataVrednost = this.tezina / 1000;
			return sracunataVrednost;
		}
		else if(jedinica.equals("t")) {
			double sracunataVrednost = this.tezina / 1000000;
			return sracunataVrednost;
		}
		else {
			return 0.0;
		}
	}



}
