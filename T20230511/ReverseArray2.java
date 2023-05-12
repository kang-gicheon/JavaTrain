package T20230511;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ReverseArray2 {

	// 배열의 요소 a[idx1]와 a[idx2]를 교환
	
	static void swap(int[]a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	// 배열a의 요소를 반대로 나열(오류)
	
	static void reverse(int[]a) {
		
		try {
			
			for (int i = 0; i < a.length / 2; i++) {
				swap(a, i, a.length - i);
			}
			
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			throw new RuntimeException("reverse의 버그?",e);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = stdin.nextInt();		// 요소 수
		
		int[]x = new int[num];			// 요소 수 num의 배열
		
		for (int i = 0; i < num; i++) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
			
		}

		try {
			
			reverse(x); 	// 배열 x의 요소를 반대로 순으로 낭려
			System.out.println("요소를 반대로 나열했습니다.");
			
			for (int i = 0; i < num; i++) 
				
			System.out.println("x[" + i + "] = " + x[i]);
		
		} catch (RuntimeException e) {
			
			System.out.println("예외               : " + e);
			System.out.println("예외의 원인 : " + e.getCause());
			
		}
		
	}

}
