package mini_projekat;

import java.util.ArrayList;

public class XandOGame {
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//			nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//			playerX - igrac X
//			playerO - igrac O
//			Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//			Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//			gettere i settere za igrace
	private player nextPlayer;
	private player playerX;
	private player playerO;
	private ArrayList<String> table = new ArrayList<String>();

	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}
	}

	public XandOGame(player playerX, player playerY) {
		super();
		this.playerX = playerX;
		this.playerO = playerO;
	}

	public player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(player playerX) {
		this.playerX = playerX;
	}

	public player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(player playerO) {
		this.playerO = playerO;
	}

	public player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

//	Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//		x | x | 0 |
//		0 | x | 0 |
//		x | 0 | x |
//
//		Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.
//		Metodu isGameOver, igra je gotova ako su sva polja popunjena.

	public void print() {
		for (int i = 0; i < table.size(); i++) {
			System.out.print(table.get(i) + " | ");
			if (i == 2) {
				System.out.println();
			} else if (i == 5) {
				System.out.println();
			}
		}
	}

	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			table.set(i, " ");
		}
		this.setNextPlayer(this.playerX);
	}

	public boolean isGameOver() {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				return false;
			}
		}
		return true;
	}

//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za
//	kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto

	public boolean isFieldFree(int pozicija) {
		return table.get(pozicija).equals(" ") ? true : false;

	}

	public player playNext() {
		if (getNextPlayer() == playerX) {
			return this.nextPlayer = playerO;
		}
		return this.nextPlayer = this.playerX;
	}

//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x

	public void makeAMove(int pozicija) {
		if (this.getNextPlayer() == playerO) {
			table.set(pozicija, "O");
		} else {
			table.set(pozicija, "X");
		}
	}
//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana
//	svoja znaka ili po koloni ili po redu ili po dijgonalama

	public boolean isWinnerX() {
		if (table.get(0).equals("X") && table.get(1).equals("X") && table.get(2).equals("X")
				|| table.get(3).equals("X") && table.get(4).equals("X") && table.get(5).equals("X")
				|| table.get(6).equals("X") && table.get(7).equals("X") && table.get(8).equals("X")
				|| table.get(0).equals("X") && table.get(3).equals("X") && table.get(6).equals("X")
				|| table.get(1).equals("X") && table.get(4).equals("X") && table.get(7).equals("X")
				|| table.get(2).equals("X") && table.get(5).equals("X") && table.get(8).equals("X")
				|| table.get(0).equals("X") && table.get(4).equals("X") && table.get(8).equals("X")
				|| table.get(2).equals("X") && table.get(4).equals("X") && table.get(6).equals("X")) {
			return true;
		} else {
			return false;
		}
	}

//	Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja
//	znaka ili po koloni ili po redu ili po dijgonalama

	public boolean isWinnerO() {
		if (table.get(0).equals("O") && table.get(1).equals("O") && table.get(2).equals("O")
				|| table.get(3).equals("O") && table.get(4).equals("O") && table.get(5).equals("O")
				|| table.get(6).equals("O") && table.get(7).equals("O") && table.get(8).equals("O")
				|| table.get(0).equals("O") && table.get(3).equals("O") && table.get(7).equals("O")
				|| table.get(2).equals("O") && table.get(5).equals("O") && table.get(8).equals("O")
				|| table.get(0).equals("O") && table.get(4).equals("O") && table.get(8).equals("O")
				|| table.get(2).equals("O") && table.get(4).equals("O") && table.get(6).equals("O")) {
			return true;
		} else {
			return false;
		}
	}

//	Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. 
//	Pozicija je validna ako je u opsegu od 0 do 8
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0

	public boolean isValidMove(int pozicija) {
		return pozicija >= 0 && pozicija < table.size() ? true : false;
	}

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}

	public void scorePrint() {
		if (this.gameScore() == 1) {
			System.out.println("Pobednik igre je: " + playerX.getImePrezime());
		} else if (this.gameScore() == 2) {
			System.out.println("Pobednikigre je: " + playerO.getImePrezime());

		} else {
			System.out.println("Igra je neresena.");
		}
	}

}
