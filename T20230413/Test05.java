// 두 정숫값 중 작은 값과 큰 값을 구해서 표시
package T20230413;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();
		
		if (a==b)
			System.out.println("두 값이 같습니다.");
		else {
			int min, max;
			if (a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}
			System.out.println("작은 값은 " + min +"입니다.");
			System.out.println("작은 값은 " + max +"입니다.");
		}
	}

}
