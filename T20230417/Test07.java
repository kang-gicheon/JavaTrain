package T20230417;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("몇 cm부터 : ");
		int hMin = stdin.nextInt();
		System.out.print("몇 cm까지 : ");
		int hMax = stdin.nextInt();
		System.out.print("몇 cm 단위 : ");
		int step = stdin.nextInt();
		System.out.println("신장 표준 체중");
		System.out.println("-----------");
		
		for (int i = hMin ; i <= hMax ; i+=step)
			System.out.println(i + "" + 0.9 * (i - 100));

	}

}
