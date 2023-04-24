package T20230424;

import java.util.Scanner;

public class Test09 {

	static int signOf(int n) {
		int sign = 0;
		
		if (n > 0)
			sign = 1;
		else if(n < 0)
			sign = -1;
		
		return sign;
	}
	
	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("정수 x : ");
		int x = stdin.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)는 " + s + "입니다.");
		

	}

}
