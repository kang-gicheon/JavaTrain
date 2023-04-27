package T20230427;

import java.util.Scanner;

public class Test07 {

	// a, b의 최솟값을 반환
	
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	// a, b, c의 최솟값을 반환
	
	static int min(int a, int b, int c) {
		
		int min = a;
		if ( b < min) min = b;
		if ( c < min) min = c;
		return min;
	
	}
		
	// 배열 a의 최솟값을 반환
		
	static int min(int[] a) {
		int min = a[0];
		for(int i = 1 ; i < a.length ; i++)
			if (a[i] < min)
			min = a[i];
			return min;
			
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("x값 : "); int x = stdin.nextInt();
		System.out.print("x값 : "); int y = stdin.nextInt();
		System.out.print("x값 : "); int z = stdin.nextInt();
		System.out.print("배열 a의 요소 수 : ");
		
		int num = stdin.nextInt();
		int[]a = new int[num]; // 요소 수가 num인 배열

		for(int i = 0 ; i < num ; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdin.nextInt();
		}
		// 두 값의 최솟값
		System.out.println("x, y의 최솟값은 " + min(x,y) + "입니다.");
		// 세 값의 최솟값
		System.out.println("x, y의 최솟값은 " + min(x,y,z) + "입니다.");
		// 배열의 최솟값
		System.out.println("x, y의 최솟값은 " + min(a) + "입니다.");
		
	}

}
