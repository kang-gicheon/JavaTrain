package T20230421;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdin.nextInt();
		int[]a = new int[n];
		
		for (int j = 0 ; j < n ; j++) {
			System.out.print("a[" + j + "] = ");
			a[j] = stdin.nextInt();
		}
		
		System.out.print("찾을 숫자 : ");
		int key = stdin.nextInt();
		
		int i;
		
		for(i = n-1 ; i >= 0 ; i--)
			if(a[i] == key)
				break;
		
		if(i >= 0)
			System.out.println("그 값은 a[" + i + "]에 있습니다.");
		else
			System.out.println("해당 값이 존재하지 않습니다.");

	}

}
