package T20230418;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		 Scanner stdin = new Scanner(System.in);
		 System.out.print("정숫값 : ");
		 int n = stdin.nextInt();
		 
		 for(int i = 1 ; i <= n ; i++)
			 System.out.println(i + "의 제곱은 " + i * i +"입니다.");

	}

}
