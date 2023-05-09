package T20230509;

public class DVDPlayerTester {

	public static void main(String[] args) {
	
		DVDPlayer a = new DVDPlayer();
		Players b = new DVDPlayer();
		Explayer c = new DVDPlayer();

		System.out.println("DVDPlayer형 변수a");
		
		a.play();
		a.stop();
		a.slow();
		
		System.out.println("Players형 변수a");
		
		b.play();
		b.stop();
		
		System.out.println("Explayer형 변수a");
		
		c.play();
		c.stop();
		c.slow();
	}

}
