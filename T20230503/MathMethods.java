package T20230503;

import java.util.Scanner;

public class MathMethods {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(in);
		
		out.print("실  수 : ");
		double x = stdin.nextDouble();
		
		out.println("절댓값 : " + abs(x));
		out.println("절댓값 : " + sqrt(x));
		out.println("절댓값 : " + PI * x * x);

	}

}
