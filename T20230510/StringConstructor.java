package T20230510;

import java.util.Scanner;

public class StringConstructor {
	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		
		char[]c = {'A','B','C','D','E','F','G','H','I','J'};
		String s1 = "ABC";					// 문자열 리터럴로 초기화
		String s2 = new String();			// String()
		String s3 = new String(c);			// String(char[])
		String s4 = new String(c,5,3);		// String(char[],int,int)
		String s5 = new String("XYZ");		// String(String)
		
		System.out.print("문자열 : ");
		String s6 = stdin.next();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("s5 = " + s5);
		System.out.println("s6 = " + s6);
		
	}
}
