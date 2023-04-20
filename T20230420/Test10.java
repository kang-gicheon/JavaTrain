package T20230420;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("요수 수 : ");
		int n = stdin.nextInt();
		int []a = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("a[" + i + "] = " );
			a[i] = stdin.nextInt();
		}
		System.out.print("a = {");
		if (n >= 2)
			for (int i = 0 ; i < n - 1 ; i++)
				System.out.print(a[i] + ", ");
		if(n >= 1)
			System.out.print(a[n-1]);
		System.out.print("}");

	}

}
