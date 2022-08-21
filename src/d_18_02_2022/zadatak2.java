package d_18_02_2022;

public class zadatak2 {

	public static void main(String[] args) {
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

		FacebookPost jedan = new FacebookPost();
		jedan.imePrezime = "Natasa Lazarevic";
		jedan.imeProfil = "Nemanja Djordjevic";
		jedan.tekstObjave ="Volim te najvise na svetu!";
		jedan.brojLajkova = 65432;
		jedan.brojDeljenja = 22;
		
		jedan.like();
		jedan.dislike();
		jedan.share();
		jedan.print();
		
		
		FacebookPost dva = new FacebookPost();
		dva.imePrezime = "Ana NIkolic";
		dva.imeProfil = "Ivan Lazarevic";
		dva.tekstObjave = "Bani, odosmo Nale i ja na kafu.";
		dva.brojLajkova = 555;
		dva.brojDeljenja = 5;
		
		dva.like();
		dva.dislike();
		dva.share();
		dva.print();
		
		
		

	}

}
