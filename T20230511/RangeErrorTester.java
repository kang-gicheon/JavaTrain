package T20230511;

import java.util.Scanner;

//범위 밖 예외

	class RangeError extends RuntimeException {
		
		RangeError(int n) {super("범위 밖 값 : " + n);}
	}
	
	// 범위 밖 예외 (매개변수)
	
	class parmeterRangeError extends RangeError {
		
		public parmeterRangeError(int n) {super(n);}
		
	}
	
	// 범위 밖 예외(반환값)
	
	class ResultRangeError extends RangeError {
		
		ResultRangeError(int n) {super(n);}
		
	}

public class RangeErrorTester {
	
	// n은 1자리 (0~9)인가?
	
	static boolean isvalid(int n) {
		
		return n >= 0 && n <= 9;
		
	}
	
	// 1자리 (0~9) 정수 a와 b의 합 구하기
	
	static int add(int a, int b) throws parmeterRangeError,ResultRangeError {
		
		if(!isvalid(a)) throw new parmeterRangeError(a);
		if(!isvalid(b)) throw new parmeterRangeError(b);
		int result = a + b;
		if(!isvalid(result)) throw new ResultRangeError(result);
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = stdin.nextInt();
		System.out.print("정수 b : "); int b = stdin.nextInt();

		try {
			
			System.out.println("합은 " + add(a,b) + "입니다.");
			
		} catch (RangeError e) {
			System.out.println("범위 밖 예외가 발생했습니다.\n" + e.getMessage());
		}
		
	}

}
