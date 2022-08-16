package d_15_08_2022;

public class zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi 
//		funkciju i ispisti odgovarajucu poruku.
		int najmanjiBroj = najmanji(2,4,6);
		System.out.println("Najmanji broj je: " + najmanjiBroj);

	}
	public static int najmanji(int a, int b, int c) {
		
		if(a < b && a < c) {
			return a;
		}
		else if(b < a && b < c) {
			return b;
		}
		else if(c < a && c < b) {
			return c;
		}
		else {
			return 0;
		}
	}
}
