package T20230421;

import java.util.Random;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdin.nextInt();
		int[]a = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdin.nextInt();
		}
		
		for(int i = 0 ; i < 2 * n ; i++) {
			int idx1 = rand.nextInt(n);		
			int idx2 = rand.nextInt(n);	
			int t = a[idx1];
			a[idx2] = t;
		}
		
		System.out.println("요소를 섞었습니다.");
		for(int i = 0 ; i < n ; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
