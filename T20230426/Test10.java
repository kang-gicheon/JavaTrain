package T20230426;

import java.util.Scanner;

public class Test10 {

	// 배열 a의 복사본을 생성해서 반환
	
	static int[] arrayClone(int[] a) {
		int[] c = new int[a.length];			// 요소 수가 a랑 같다
		for (int i = 0 ; i < c.length ; i++)	// 전체 요소 복사
			c[i] = a[i];
		return c;
	}
	
	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = stdin.nextInt();
		
		int[]x = new int[num];		// num 크기의 배열 생성
		
		for(int i = 0 ; i < num ; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
		}

		int[] y = arrayClone(x);
		
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		
		for(int i = 0 ; i < num ; i++)
			System.out.println("y[" + i + "] = " + y[i]);
	}

}
