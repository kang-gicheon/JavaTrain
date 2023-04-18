<<<<<<< HEAD
package T20230417;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		
		int x;
		
		do {
			System.out.print("양의 정숫값:");
			x = stdin.nextInt();
		} while (x <= 0);
		
		for (; x>=0 ; x--)
			System.out.println(x);

	}

}
=======
package T20230417;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		
		int x;
		
		do {
			System.out.print("양의 정숫값:");
			x = stdin.nextInt();
		} while (x <= 0);
		
		for (; x>=0 ; x--)
			System.out.println(x);

	}

}
>>>>>>> 30e26c07c5294ac273fce15215c824bedaaa7b9d
