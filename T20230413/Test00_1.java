// 2개의 실수값을 읽어서 큰 쪽을 표시(방법2:조건 연산자)
package T20230413;

import java.util.Scanner;

public class Test00_1 {

	public static void main(String[] args) {
		
Scanner stdin = new Scanner(System.in);
		
		System.out.println("실수 a:"); double a = stdin.nextDouble();
		System.out.println("실수 b:"); double b = stdin.nextDouble();
		
		double max = a > b ? a : b;
		
		
		System.out.println("큰 쪽의 값은 " + max + "입니다.");

	}

}
