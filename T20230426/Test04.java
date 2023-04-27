package T20230426;

import java.util.Scanner;

// 가장 키가 작은 사람의 신장과 마른 사람의 체중을 구한다.

public class Test04 {
	
	// 배열 a의 최솟값을 구해서 반환
	
	static int minOf(int[] a) {
		int min = a[0];
		
		for (int i = 1 ; i < a.length ; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}

	public static void main(String[] args) {
		
	
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("사람 수는 : ");
		int num = stdin.nextInt(); // 사람 수를 읽을 수 있게 작성
				
		int[] height = new int[num];	//신장용 배열을 생성
		int[] weight = new int[num];	//체중용 배열을 생성
		
		System.out.println(num + "명의 신장과 체중을 입력하자.");
		
		for(int i = 0 ; i < num ; i++) {
			System.out.print((i + 1) + "번의 신장 : ");
			height[i] = stdin.nextInt();
			System.out.print((i + 1) + "번의 체중 : ");
			weight[i] = stdin.nextInt();
		}
		
		System.out.println("가장 키가 작은 사람의 신장 : " + minOf(height) + "cm");
		System.out.println("가장 마은 사람의 신장 : " + minOf(weight) + "kg");
		

	}

}
