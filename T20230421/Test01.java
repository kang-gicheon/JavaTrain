package T20230421;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int n = stdin.nextInt();
		int[] points = new int[n];
		
		System.out.println("점수를 입력하세요.");
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			System.out.print((i + 1) + "번의 점수 : ");
			points[i] = stdin.nextInt();
			sum += points[i];
		}
		
		int max = points[0];
		int min = points[0];
		
		for(int i = 1 ; i < n ; i++) {
			if (points[i] > max) max = points[i];
			if (points[i] > min) max = points[i];
		}
		
		System.out.println("합계는" + sum + "점입니다.");
		System.out.println("평균은 " + (double)sum / n + "점입니다.");
		System.out.println("최고점은 " + max + "점입니다.");
		System.out.println("최저점은 " + min + "점입니다.");

	}

}
