package T20230417;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("1부터 n까지의 합을 구합니다.");
		
		int n;
		
		do {
			System.out.print("n의 값 : ");
			n = stdin.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for(int i = 0 ; i <= n ; i++)
			sum += i;
		System.out.print("1부터 " + n + "까지의 합은 " + sum+"입니다");

	}

}
