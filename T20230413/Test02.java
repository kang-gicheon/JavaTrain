//읽은 두 값의 차가 10이하인지를 표시(방법1 :  if문)
package T20230413;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();

		int diff = a >= b ? a -b : b -a;
		
		if (diff <= 10)
			System.out.println("두 값은 차는 10이하입니다");
		else
			System.out.println("두 값은 차는 10이상입니다");
			
	}

}
