// 3개의 정숫값을 오름차순으로 정렬
package T20230413;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정수 a:"); int a = stdin.nextInt();
		System.out.println("정수 b:"); int b = stdin.nextInt();
		System.out.println("정수 c:"); int c = stdin.nextInt();
		
		if (a > b) {
			int t = a; a= b; b= t;
		}
		
		if ( b > c) {
			int t = b; b= c; c= t;
		}
		
		if (a>b) {
			int t = a; a= b; b= t;
		}
		
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는" + a +"입니다");
		System.out.println("변수 a는" + b +"입니다");
		System.out.println("변수 a는" + c +"입니다");
		
	}

}
