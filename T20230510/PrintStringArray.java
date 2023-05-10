package T20230510;

import java.util.Scanner;

public class PrintStringArray {

	// 문자열 배열 표시
	
	static void printStringArray(String[] a) {
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length(); j++) 
				
				System.out.print(a[i].charAt(j));
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("문자열의 개수 : ");
		int n = stdin.nextInt();
		String[] sx = new String[n];
		
		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdin.next();
		}
			printStringArray(sx);
	}

}
