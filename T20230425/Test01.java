package T20230425;

import java.util.Scanner;

// 1부터 n까지의 합을 구하는 프로그램

public class Test01 {

	// --- 1부터 n까지의 합 ---
	
	static int sumUp(int n) {
		int sum = 0; // 합계
		
		for(int i = 1 ; i <= n ; i++)
			sum += i; // sum에 i를 더할 수 있게 작성
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구하자.");
		
		int x;
		
		do {
			System.out.print("x의 값 : ");
			x = stdin.nextInt();
		} while (x <= 0);

		System.out.println("1부터 " + x + "까지의 합은 " + sumUp(x) + "입니다.");
		
	}

}
