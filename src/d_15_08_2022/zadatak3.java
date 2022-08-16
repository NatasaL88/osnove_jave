package d_15_08_2022;

public class zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca
//		novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

		int broj = dvocifrenBroj(3, 4);
		System.out.println(broj);

	}
	public static int dvocifrenBroj(int a, int b) {
		int c = a * 10 + b;
		return c;
	}

}
