package T20230412;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int n = stdin.nextInt();
		
		// if (조건식) 실행문 else 실행문
		
		if(n>=0)
			// n>=0이 true일 때 실행한다.
			System.out.println("절댓값은 " + n + "입니다.");
		else
			// n>=0이 false일 때 실행한다.
			System.out.println("절댓값은 " + -n + "입니다.");
		

	}

}
