package T20230414;

import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?:");
		
		int n = stdin.nextInt();
		
		if (n > 0) {
			int i = 0;
			while(1 < n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}

	}

}
