package T20230419;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("변수 x는 float형입니다. 변수 y는 double형입니다.");
		System.out.print("x : ");
		float x = stdin.nextFloat();
		System.out.print("y : ");
		double y = stdin.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
