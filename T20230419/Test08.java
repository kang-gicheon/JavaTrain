package T20230419;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("x값 : "); int x = stdin.nextInt();
		System.out.print("y값 : "); int y = stdin.nextInt();
		System.out.print("z값 : "); int z = stdin.nextInt();

		double ave = (x + y + z) / 3;
		System.out.printf("x, y, z의 평균은 %.3f입니다.\n",ave);
	}

}
