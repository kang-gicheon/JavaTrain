package T20230419;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("정숫값  x, y, z의 평균을 구합니다.");
		System.out.print("x갑 : "); int x = stdin.nextInt();
		System.out.print("y갑 : "); int y = stdin.nextInt();
		System.out.print("z갑 : "); int z = stdin.nextInt();

		double ave = (double) (x + y + z) / 3;
		System.out.printf("x, y, z의 평균은 %.3f입니다.\n", ave);
		
	}

}
