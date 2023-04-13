// 읽은 2개의 실숫값 중에서 큰 쪽을 표시(방법 1 ㅣ if문)
package T20230413;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("실수 a:"); double a = stdin.nextDouble();
		System.out.println("실수 b:"); double b = stdin.nextDouble();
		
		double max;
		if(a > b)
			max = a;
		else
			max = b;
		
		System.out.println("큰 쪽의 값은 " + max + "입니다.");
	}

}
