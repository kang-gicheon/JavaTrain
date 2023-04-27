package T20230427;

import java.util.Scanner;

public class Test03 {

	// 배열 a의 a[idx]부터 n개의 요소를 삭제한 배열을 반환
	static int[] arryRmvOfN(int []a, int idx, int n) {
		if(n < 0 || idx > a.length)
			return a.clone();
		else {
			if(idx + n > a.length)
				n = a.length - idx;
			int[]c = new int[a.length - n];
			int i = 0;
			for(; i < idx ; i++)
				c[i] = a[i];
			for(; i < a.length - n ; i++)
				c[i] = a[i + n];
			return c;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = stdin.nextInt();
		int[]x = new int[num];
		
		for (int i = 0 ; i < num ; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스 : ");
		int idx = stdin.nextInt();
		
		System.out.print("삭제할 요소의 개수 : ");
		int n = stdin.nextInt();
		
		// 배열x의 x[idx]부터 n개의 요소를 삭제한 배열 생성
		int[]y = arryRmvOfN(x, idx, n);
		
		for(int i = 0 ; i < y.length ; i++) // 배열 y 표시
			
			System.out.println("y[" + i + "] = " + y[i]);

	}

}
