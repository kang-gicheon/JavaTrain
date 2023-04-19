package T20230414;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int retry;
		
		do {
			System.out.println("정숫값:");
			int n = stdin.nextInt();
			
			if (n>0)
				System.out.println("이 값은 양수입니다.");
			else if (n<0)
				System.out.println("이 값은 양수입니다.");
			else
				System.out.println("이 값은 0입니다.");
			
			System.out.println("다시 한번? 1-Yes / 0-No:");
			retry = stdin.nextInt();
		}while (retry == 1);
	}

}
