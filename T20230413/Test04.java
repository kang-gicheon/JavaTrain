// 3개의 정수 중 중앙값 구하기
package T20230413;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();
		System.out.println("정수 c:"); int c = stdin.nextInt();

		int med;
		if(a >= b)
			if(b >= c)
				med = b;
			else if(a > c)
				med = a;
			else
				med = c;
		else if (a>c)
			med = a;
		else if(b>c)
			med = c;
			
		else
			med = b;
		
		System.out.println("중앙값은 " + med +"입니다.");
	}

}
