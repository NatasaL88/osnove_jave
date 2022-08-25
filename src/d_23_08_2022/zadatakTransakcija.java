package d_23_08_2022;

public class zadatakTransakcija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Racun prenosilac = new Racun(837498.00);
		prenosilac.setImePrezime("Natasa Lazarevic");
		prenosilac.setBrRacuna("2222-334435435435");
			
		Racun primalac = new Racun(22000.00);
		primalac.setImePrezime("Nemanja Djordjevic");
		primalac.setBrRacuna("3453-435789");
		
		
		Transakcija jedan = new Transakcija("5566");
		jedan.setPrenosilac(prenosilac);
		jedan.setPrimalac(primalac);
		
		jedan.izvrsiTransakciju(2200.00);
		prenosilac.promenjenoStanje(2200.00);
		
		prenosilac.print();
		jedan.print();
		
		
	}

}
