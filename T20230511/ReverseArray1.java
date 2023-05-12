package T20230511;

import java.util.Scanner;

public class ReverseArray1 {
	
	// 배열의 요소 a[idx]와 a[idx2]를 교환
	
	static void swap(int[]a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	static void reverse(int []a) {
		
		try {
			
			for (int i = 0; i < a.length; i++) 
				swap(a, i, a.length -1);
				
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		}  catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = stdin.nextInt();		//요소 수
		int[]x = new int[num];			//요소 수 num의 배열
		
		for (int i = 0; i <num; i++) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
			
		}
		
		reverse(x);		// 배열 x의 요소를 반대로 순으로 나열
		
		System.out.println("요소를 반대로 나열했습니다.");
		
		for (int i = 0; i < num; i++) 
		System.out.println("x[" + i + "] = " + x[i]);
		
		
	}

}
