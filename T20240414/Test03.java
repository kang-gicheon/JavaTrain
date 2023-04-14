package T20240414;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("정수 A:"); int a = stdin.nextInt();
		System.out.println("정수 B:"); int b = stdin.nextInt();
		
		if(a>b) {
			
			int t = a;
			a = b;
			b = t;
		}

		do {
			System.out.println(a + " ");
			a = a +1;
		}while ( a <= b);
		System.out.println();
	}

}
