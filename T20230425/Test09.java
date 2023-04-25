package T20230425;

import java.util.Scanner;

// 2의 거듭 제곱과 시프트 연산의 일치성 확인

public class Test09 {

	// 2의 거듭 제곱 반환
	
	static int pow2(int no) {
		int pw = 1;
		while (no-- > 0)
			pw *= 2;
		return pw;
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 x를 n비트 시프트합니다.");
		System.out.print("x : "); int x = stdin.nextInt();
		System.out.print("n : "); int n = stdin.nextInt();
		
		int mPower = x * pow2(n); // 2의 n승을 곱한 값
		int dPower = n * pow2(n); // 2의 n승으로 나눈 값
		int  lshift = x << n;; // n비트 왼쪽으로 시프트한 값
		int  rshift = x >> n;; // n비트 오른쪽으로 시프트한 값
		
		System.out.printf("[a] X x (2의 %d승) = %d\n", n, mPower);
		System.out.printf("[b] X x (2의 %d승) = %d\n", n, dPower);
		System.out.printf("[c] X << %d = %d\n", n, lshift);
		System.out.printf("[d] X << %d = %d\n", n, rshift);
		
		System.out.println("[a]와 [c]의 값이 일치" + 
						((mPower == lshift) ? "합니다" : "하지 않습니다."));
		System.out.println("[b]와 [d]의 값이 일치" + 
				((dPower == rshift) ? "합니다" : "하지 않습니다."));

	}

}
