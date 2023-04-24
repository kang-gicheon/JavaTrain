package T20230424;

import java.util.Scanner;

public class Test10 {

	static int min(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("정수 a : "); int a = stdin.nextInt();
		System.out.print("정수 b : "); int b = stdin.nextInt();
		System.out.print("정수 c : "); int c = stdin.nextInt();
		System.out.println("최솟값은 " + min(a,b,c) + "입니다.");
	}

}
