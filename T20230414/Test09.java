package T20230414;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("양의 정숫값의 자릴수를 표시합니다.");
		
		int x;
		
		do {
			System.out.println("양의 정숫값");
			x = stdin.nextInt();
		} while (x <= 0);
			
		int digit = 0;
		while ( x > 0) {
			digit++;
			x /= 10;
		}
		System.out.println("입력한 숫자는 " +digit + "자리입니다.");

	}

}
