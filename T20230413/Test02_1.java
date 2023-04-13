// 읽은 두 값의 차가 11이상인지를 표시(방법2 : 조건 연산문)
package T20230413;

import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		

Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();

		int diff = a >= b ? a -b : b - a;
		
		System.out.println("두 값은 차는 " +
						(diff <= 10 ? "10이하" : "11이상") +"입니다.");
			
		
	}

}
