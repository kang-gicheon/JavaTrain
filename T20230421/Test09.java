package T20230421;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdin.nextInt();
		int[]a = new int[n];
		int[]b = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdin.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) {
			b[i] = a[n-i-1];
		}

		System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
		
		for (int i = 0 ; i < n ; i++)
			System.out.println("b[" + i + "] = " +b[i]);
	}

}
