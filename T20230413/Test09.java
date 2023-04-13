// 읽은 월의 계절을 표시
package T20230413;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("몇 월입니까?:");
		int month = stdin.nextInt();
		
		switch(month) {
		case 3 :
		case 4 :
		case 5 : System.out.println("봄"); break;
		case 6 :
		case 7 :
		case 8 : System.out.println("여름"); break;
		case 9 :
		case 10 :
		case 11 : System.out.println("가을"); break;
		case 12 :
		case 1 :
		case 2 : System.out.println("겨울"); break;
		default : System.out.println("그런 월은 없습니다."); break;
		}
	}

}
