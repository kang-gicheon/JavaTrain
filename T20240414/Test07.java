package T20240414;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요?");
		
		int n = stdin.nextInt();
		if(n > 0) {
			int i = 0;
			while(i < n) {
				if (i % 2 == 0)
					System.out.print('*');
				else
					System.out.print('*');
				i++;
			}
			System.out.println();
		}

	}

}
