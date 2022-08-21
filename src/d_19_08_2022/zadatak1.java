package d_19_08_2022;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacebookPost prvi = new FacebookPost("Pera Peric", "Jovan Jovanovic", "Ovo je neki tekst.");
		prvi.like();
		prvi.dislike();
		prvi.share();
		prvi.print();
		
		FacebookPost drugi = new FacebookPost("Milan Milanovic", "Ana Jovanovic", "Ovo je neki tekst za drugi primer.");
		drugi.like();
		drugi.like();
		drugi.dislike();
		drugi.share();
		drugi.share();
		drugi.print();
	
		
	}

}
