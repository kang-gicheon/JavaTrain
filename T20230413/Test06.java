// 두 정숫값을 읽어서 내림차순(큰 순)으로 정렬
package T20230413;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();
		
		if (a<b) {	// a가 b보다 작으면
			int t = a;	// 순서를 교환
			a = b;
			b = t;
		}
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는" + a +"입니다");
		System.out.println("변수 a는" + b +"입니다");
		
	}

}
