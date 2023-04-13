package T20230412;

import java.util.Scanner;

public class Test01_1 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수값 :");

		int n = stdin.nextInt();
		int abs;
		
		// if(조건식) 싫앰문 else 실행문
		
		if(n>=0)
			abs = n; // n>=0이 true일 때 실행
		else
			abs = -n; // n>=0이  false일 때 실행
		System.out.println("절댓값은" + abs + "입니다.");
	}

}
