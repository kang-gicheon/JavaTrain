package T20230424;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Random rand = new Random(); // 새로운 난수 생성
		Scanner stdin = new Scanner(System.in); // 새로운 입력값을 받을 수 있게 생성
		
		// daykorean의 배열 생성
		
		String[] daykorean = {"일","월","화","수","목","금","토"};
		// dayEnglish의 배열 생성
		String[] dayEnglish = {"sunday","monday","tuesday",
				"wednesday","thursday","friday","saturday"};
				
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		
		
		int retry; // 다시 한번 선언
		int last = -1; // 이전 요일 선언

		do {
			int day; // 표시할 요일 : 0~6의 난수
			do {
				day = rand.nextInt(7);
			}while (day == last);
			last = day;
			
			
			// 무한루프 제작
			while (true) {
				System.out.print(daykorean[day]+ "요일 : ");
				String s = stdin.next();
				
				if(s.equals(dayEnglish[day])) break; // 정답
				System.out.println("틀렸습니다.");
			}
			System.out.print("정답입니다. 다시 한번? 1...Yes/0...No : ");
			retry = stdin.nextInt();
			
		} while(retry == 1);
	}

}
