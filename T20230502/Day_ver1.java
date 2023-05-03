package T20230502;

public class Day_ver1 {

	private int year = 1;	// 년
	private int month = 1;	// 월
	private int date = 1;	// 일
	

	// 생성자
	
	public Day_ver1()										{ }
	public Day_ver1(int year)								{this.year = year;}
	public Day_ver1(int year,int month)						{this(year); this.month = month;}
	public Day_ver1(int year,int month, int date)			{this(year,month);  this.date = date;}
	public Day_ver1(Day_ver1 d)								{this(d.year,d.month, d.date); }
	
	// 년, 월, 일 불러오기
	
	public int getYear() { return year; } 			// 년 불러오기
	public int getMonth() { return month; } 		// 년 불러오기
	public int getDate() { return date; } 			// 년 불러오기
	
	// 년, 월, 일 설정
	
	public void setYear(int year)	{this.year = year; }		// 년 설정
	public void setMonth(int month)	{this.month = month; }		// 월 설정
	public void setDate(int date)	{this.date = date; }		// 일 설정
	
	
	public void set(int year, int month, int date) {		//	년,월,일 설정
	
		this.year = year;		// 년
		this.month = month;		// 월
		this.date = date;		// 일
	}
	
	// 요일 찾기
	
	public int dayOfWeek() {
		
		int y = year;
		int m = month;
		
		if(m == 1 || m == 2) {
			
			y--;
			m += 12; 
			
		}
		
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
		
	}
	
	// 날짜 d와 같은지 판별
	
	public boolean equalTo(Day_ver1 d) {
		
		return year == d.year && month == d.month && date == d.date;
		
	}
 	
	
	// 문자열 표현 반환
	
	public String toString() {
		
		String[] wd = {"일","월","화","수","목","금","토"};
		
		return String.format("%04년 %02월 %02일(%s)",
						year,month,date,wd[dayOfWeek()]);
		
	}
	
}
