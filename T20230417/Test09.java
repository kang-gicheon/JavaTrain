package T20230417;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요? : ");
		
		int n = stdin.nextInt();
		
		if (n > 0) {
			for(int i = 0 ; i < n ; i++)
				System.out.println("*****");
			int rest = n % 5;
			
		if (rest > 0) {
			for(int i = 0 ; i < rest; i++)
				System.out.print("*");
			System.out.println();
			}
		}

	}

}
