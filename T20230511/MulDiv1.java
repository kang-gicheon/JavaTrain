package T20230511;

import java.util.Scanner;

public class MulDiv1 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("x값 : "); int x = stdin.nextInt();
		System.out.print("y값 : "); int y = stdin.nextInt();
		
		System.out.println("x * y = " + (x * y));	// x * y값 표시(곱)
		System.out.println("x / y = " + (x / y));	// x * y값 표시(곱)
	}

}
