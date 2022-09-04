package mini_projekat;

import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {
//		Ucitati podatke za igrace
//		Kreirajte objekat klase XandOGame 
//		Startujte igru, tada je na potezu igrac X
//		Saveti za dobar zadatak
//		Igra treba da traje dok (while petlja)
//		nije kraj igre - imamo metodu za to
//		Ili dok ne dobijemo pobednika
//		U petlji
//		Trazimo od aktuelnog igraca da unese potez
//		Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//		Prebacujemo red na drugog igraca
//		Stampamo tablu
//		Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//		Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace

		Scanner s = new Scanner(System.in);
		player playerX = new player("Natasa Lazarevic");
		player playerO = new player("Nemanja Djordjevic");
		XandOGame igra = new XandOGame();
		igra.setPlayerX(playerX);
		igra.setPlayerO(playerO);
		igra.startGame();
		
		while(igra.isGameOver() == false) {
			System.out.println("Na redu je igrac " + igra.getNextPlayer().getImePrezime());
			System.out.println("Unesite poziciju koju zelite da odigrate: ");
			int pozicija = s.nextInt();
			
			if(igra.isValidMove(pozicija) == true && igra.isFieldFree(pozicija) == true) {
				igra.makeAMove(pozicija);
				igra.print();
				igra.playNext();
			}
			else {
				System.out.println("Polje nije validno. Odigrajte neko drugo polje.");
			
			}
		}
		
		igra.scorePrint();
		

	}

}
