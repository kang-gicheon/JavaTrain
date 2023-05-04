package T20230503;

import java.sql.Date;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateId {

	private static int counter;		// 몇 번까지 식별 번호를 부여했는가
	private int id;					// 식별 번호

	static {
		
		GregorianCalendar today = new GregorianCalendar();
		
		int y = today.get(Calendar.YEAR);		// 연
		int m = today.get(Calendar.MONTH)+1;	// 월
		int d = today.get(Calendar.DATE);		// 일
	
		System.out.printf("오늘은 %04d년 %02d일입니다.\n",y,m,d);
		
		counter = y * 1000000 + m * 10000 + d * 100;
		
		
	}
	
	public DateId() {
		
		id = ++counter;
		
	}
	
	public int getId() {
		
		return id;
		
	}
	
}
