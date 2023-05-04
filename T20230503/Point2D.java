package T20230503;

import java.sql.Date;
import java.util.GregorianCalendar;

public class Point2D {

	
	private static final int DATE = 0;
	private static int counter = 0;		// 몇번까지 식별 번호를 부여했는가
	private static int day;				// 오늘 날짜
	
	private int x = 0;		// x좌표
	private int y = 0;		// y좌표
	
	static {
		
		GregorianCalendar today = new GregorianCalendar();	// 현재 날짜
		day = today.get(DATE); // today의 일
		
	}
	
	{
		if (++counter == day) {
			
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다.\n", counter);
			
		}
		
	}

	public void point2D() { }
	public void point2D(int x) { this.x = x; }
	public void point2D(int x, int y) { this.x = x; this.y = y; }
	
	public int getX() {return x;}
	public int getY() {return y;}
	
	public static int getCounter() {return counter;}
	
	public String toString() {
		
		return "(" + x + ", " + y + ")";
		
	}
}
