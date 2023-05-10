package T20230510;

public class StringTester {

	public static void main(String[] args) {
	
		String s1 = null;		//null참조(참조하지 않는다)
		String s2 = "";			// ""을 참조
		String s3 = "ABC";		// "ABC"를 참조
		String s4 = "ABC";		// "ABC"를 참조
		String s5 = "ABC";		// "ABC"를 참조
		
		s5 = "XYZ";
		
		System.out.println("문자열 s1 = " + s1);
		System.out.println("문자열 s2 = " + s2);
		System.out.println("문자열 s3 = " + s3);
		System.out.println("문자열 s4 = " + s4);
		System.out.println("문자열 s5 = " + s5);
		System.out.println("s3와 s4는 같은 문자열 리터럴을 참조" +
					((s3 == s4) ? "하고 있다." : "하고 있지 않다."));
	}

}
