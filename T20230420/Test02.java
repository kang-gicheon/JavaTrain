package T20230420;

public class Test02 {

	public static void main(String[] args) {
		
		System.out.println("float       int");
		System.out.println("--------------------");
		
		float x = 0.0F;
		for (int i = 0 ; i <= 1000; i++, x +=0.001F)
		System.out.printf("%9.7f  %9.7f\n" , x , (float)i / 1000 );
	}

}
