package T20230419;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdin = new Scanner(System.in);
		
		final int MAX_NO = 6;
		int leftNO = MAX_NO;
		int no = rand.nextInt(100);
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");

		int x;
		do {
			System.out.print("남은 횟수 " + (leftNO--) + "회, 어떤 숫자일까? : ");
			x = stdin.nextInt();
			
			if (x > no)
				System.out.println("더 작은 숫자입니다.");
			else if (x < no)
				System.out.println("더 큰 숫자입니다");
		}while (x != no && leftNO > 0);
		
		if (x == no)
			System.out.print((MAX_NO - leftNO) + "회만에 맞추었습니다.");
		else
			System.out.print("아쉽네요. 정답은 " + no + "입니다.");
		
		
		
	}

}
