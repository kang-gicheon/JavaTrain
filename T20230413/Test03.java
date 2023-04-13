// 3개의 정수 중 최솟값 구하기
package T20230413;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();
		System.out.println("정수 b:"); int c = stdin.nextInt();
		
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;

		System.out.println("최솟값은 " + min +"입니다." );
	}

}
