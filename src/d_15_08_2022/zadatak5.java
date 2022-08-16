package d_15_08_2022;

public class zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.
		parametri(6, '+');
	}
	public static void parametri(int a, char b) {
		for(int i = 0; i < a; i++) {
			System.out.print(b + " ");
		}
	

}
}