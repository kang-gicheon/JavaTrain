package T20230511;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulDiv2 {

	static int mul(int x, int y) {
		
		return x * y;
		
	}
	
	static int div(int x, int y) {
		
		return x / y;
		
	}
	
	static void muldiv(int x, int y) {
		
		System.out.println("x * y = " + (x * y));	// x * y값 표시(곱)
		System.out.println("x / y = " + (x / y));	// x * y값 표시(곱)
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		try {
			
			System.out.print("x값 : "); int x = stdin.nextInt();
			System.out.print("y값 : "); int y = stdin.nextInt();
			muldiv(x,y);
			
		} catch (InputMismatchException e) {
			
			System.out.println("입력 오류 발생." + e);
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			
			System.out.println("산술 오류 발생." + e);
			e.printStackTrace();
			
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}

	}

}
