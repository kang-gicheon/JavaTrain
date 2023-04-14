package T20240414;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int x;
		
		do {
			System.out.println("세 자리의 정숫값");
			x = stdin.nextInt();
		}while ( x < 100 || x > 999);
		
		System.out.println("입력한 값은 " + x + "입니다.");
	}

}
