package T20240414;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요?");
		int n = stdin.nextInt();
		
		if(n > 0) {
			int i = 0;
			while(i < n / 2) {
				System.out.print("*+");
				i++;
			}
			if (n % 2 == 1)
				System.out.print('*');
			System.out.println();
		}
	}

}
