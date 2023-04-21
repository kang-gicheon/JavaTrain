package T20230421;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("요소 수 : ");
		
		int n = stdin.nextInt();
		double[] a =new double[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdin.nextDouble();
		}
		double sum = 0;
		for (double i : a)
			sum += i;

		System.out.println("모든 요소의 합은 " + sum + "입니다.");
		System.out.println("모든 요소의 평균은 " + sum / n + "입니다.");
	}

}
