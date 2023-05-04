package T20230503;

import java.util.GregorianCalendar;
import java.util.Random;

public class LuckyDraw {

	public static void main(String[] args) {
		
		GregorianCalendar today = new GregorianCalendar();

		int y = today.get(GregorianCalendar.YEAR);	// 연
		int m = today.get(GregorianCalendar.MONTH) + 1;	// 월
		int d = today.get(GregorianCalendar.DATE);	// 일
		
		System.out.printf("오늘은 %04d년 %02d일입니다.\n",y,m,d);
		
		Random rand = new Random();
		
		int k = rand.nextInt(10);		// 운세 : 0~9의 난수
		System.out.print("오늘의 운세는 ");
		
		switch(k) {

		case 0 :					System.out.println("대길"); break;

		case 1 : case 2 : case 3 :	System.out.println("길"); break;

		case 4 : case 5 : case 6 : 	System.out.println("중길"); break;

		case 7 : case 8 :			System.out.println("소길"); break;

		case 9 :					System.out.println("흉"); break;

		}
		
		System.out.println("입니다.");
		
	}

}
