// 읽은 정숫값의 부호(양수/음수/0를 판정해서 표시
package T20230412;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정숫값:");
		int n = stdin.nextInt();
	

		if(n>0)
			System.out.println("값이 양수입니다.");
		else if(n<0)
			System.out.println("값이 음수입니다.");
		else
			System.out.println("값이 0입니다.");
	}

}
