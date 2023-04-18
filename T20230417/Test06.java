<<<<<<< HEAD
package T20230417;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int n;
		
		do {
			System.out.print("n의 값 : ");
			n = stdin.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(n + " = ");
		sum += n;
		System.out.println(sum);
	}

}
=======
package T20230417;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int n;
		
		do {
			System.out.print("n의 값 : ");
			n = stdin.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(n + " = ");
		sum += n;
		System.out.println(sum);
	}

}
>>>>>>> 30e26c07c5294ac273fce15215c824bedaaa7b9d
