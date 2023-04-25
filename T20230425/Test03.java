package T20230425;

import java.util.Scanner;

// 지정한 월의 계절을 표시하는 메서드 제작

public class Test03 {

	// m월의 계절을 표시하게 작성

	static void prinSeason(int m) {
		
		switch (m) {
		
		case 3 : case 4 : case 5 : System.out.print("봄"); break;
		case 6 : case 7 : case 8 : System.out.print("여름"); break;
		case 9 : case 10 : case 11 : System.out.print("가을"); break;
		case 1 : case 2 : case 12 : System.out.print("겨율"); break;
		
		// case 3,4,5월은 봄으로 출력
		// case 6,7,8월은 여름으로 출력
		// case 9,10,11월은 가을로 출력
		// case 1,2,12월은 겨울로 출력
		
		}
	
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int month;
		
		do {
			System.out.print("몇 월입니까(1~12) : ");
			month = stdin.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.println("해당 월의 계절은 ");
		prinSeason(month);
		System.out.print("입니다.");
	}

}
