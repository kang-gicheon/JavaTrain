package T20230510;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("문자열 s1 : "); String s1 = stdin.next();
		System.out.print("문자열 s2 : "); String s2 = stdin.next();

		// s1에 s2가 포함되어 있는가?
		
		int idx = s1.indexOf(s2);
		
		if(idx == -1)
			System.out.println("s1 안에 s2가 포함돼 있지 않습니다.");
		else {
			
			System.out.println(s1);
			for (int i = 0; i < idx; i++) {
				System.out.print(' ');
				System.out.println(s2);
			}
			
		}
	}

}
