package T20230417;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int n = stdin.nextInt();
		
		int count = 0;
		
		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				System.out.print(i + "");
				count++;
			}
		
		System.out.println("\n의 약수는 " + count + "개입니다.");

	}

}
