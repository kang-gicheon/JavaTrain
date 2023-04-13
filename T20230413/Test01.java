// 읽은 두 정숫값의 차를 표시(방법1 : if문)
package T20230413;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();
		
		int diff;
		if (a >= b)
			diff= a-b;
		else
			diff = b-a;
		
		System.out.println("두 값의 차는 " + diff + "입니다.");
		
	}

}
