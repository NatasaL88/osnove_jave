package d_23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatakZekeniKarton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		
		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton> spisak = new ArrayList<ZeleniKarton>();
		System.out.println("Unesite ime i prezime studenta: ");
		String punoIme = s.nextLine();
		System.out.println("Unesite broj indeksa: ");
		String brojIndeksa = s.nextLine();
		System.out.println("Unesite broj ispita: ");
		int br = s.nextInt();
		
		for(int i = 0; i < br; i++) {
		System.out.print("Unesite naziv ispita: ");
		String nazivIspita = s.next();
		System.out.print("Unesite ime i prezime profesora: ");
		String punoImeProf = s.next();
		System.out.println("Unesite ocenu: ");
		int ocena = s.nextInt();
		
		ZeleniKarton karton = new ZeleniKarton(punoIme, brojIndeksa);
		karton.setNazivPredmeta(nazivIspita);
		karton.setImePrezimeProf(punoImeProf);
		karton.setOcena(ocena);
		spisak.add(karton);
	}
		for(int i = 0; i < spisak.size(); i++) {
			spisak.get(i).print();
		}
		



	}

}
