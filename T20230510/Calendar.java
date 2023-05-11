package T20230510;

import java.util.GregorianCalendar;


public class Calendar {

	// 각 월의 일수
	
	static int[] mday = {31, 28, 31, 30, 31, 30, 31,31,30,31,30,31};
	
	// year년 month월 day 일의 요일을 구하기
	
	static int dayOfWeek(int year, int month, int day) {
		
		if (month == 1 || month == 2) {
			
			year--;
			month += 12;
			
		}
		
		return (year + year/4 - year/100 + year/400 + (13*month + 8) / 5 + day) % 7;
		
	}
	
	// year년은 윤년? (0...평년 / 1... 윤년)
	
	static boolean isLeap(int year) {
		
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
	}
	
	// year년 month월의 일수 (28 ~ 31)
	
	static int monthDays(int year, int month) {
		
		if (month-- != 2)								// month가 2월이 아니면
			return mday[month];
		return mday[month] + (isLeap(year) ? 1 : 0);	// month가 2월이면
	}
	
	// year년 month월의 달력 표시
	
	static void putCalendar(int year, int month) {
		
		int wd = dayOfWeek(year, month, 1);		// year년 month월 1일의 요일
		int mdays = monthDays(year, month);		// year년 month월의 일수

		System.out.println(" 일 월 화 수 목 금 토 ");
		System.out.println("---------------------");
		
		for (int i = 0; i < wd; i++) 
			System.out.print("  ");		// 1일보다 왼쪽 스페이스를 표시
		for (int i = 1; i <= mdays; i++) {
			
			System.out.printf("%3d",i);
			if (++wd % 7 == 0)			// 토요일을 표시한 후
				System.out.println();	// 줄 바꿈
			
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int year = 1, month = 1;
		
		if(args.length == 0) {
			
			GregorianCalendar today = new GregorianCalendar();	// 현재 날짜
			year = today.get(today.YEAR);			// 년
			month = today.get(today.MONTH) + 1;	// 월
			 
		} else {
			
			if (args.length >= 1) {		// args[0] 해석
				
				year = Integer.parseInt(args[0]);
				
				if (year < 0) {
					
					System.out.println("년 지정이 잘못됐습니다.");
					return;
				}
				
			}
			
			if (args.length >= 2) {			// args[1] 해석
				month = Integer.parseInt(args[1]);
				if(month < 1 || month > 12) {
					
					System.out.println("월 지정이 잘못됐습니다.");
					return;
				}
			}
			

		}
			if (args.length == 0 || args.length >= 2) {
				
				System.out.printf("%d년 %d월 달력\n",year,month);
				putCalendar(year, month);	// year년 month월 달력 표시
				
			} else {
				
				System.out.printf("%d년의 달력\n", year);
				for (month = 1; month <= 12; month++) {
					
					System.out.printf("%d월\n",month);
					putCalendar(year, month);	// year년 month월 달력 표시
					System.out.println();
					
				}
				
			}
			
		}
		
	}

