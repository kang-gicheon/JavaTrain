package T20230503;

public class Account {

	private static int counter = 0;	// 몇 번까지 식별 번호를 부여했는가
	
	private String name;	// 계좌 명의
	private String no;		// 계좌 번호
	private long balance;	// 예금 잔고
	private Day openDay;	// 계좌 개설일
	private int id;
	
	// 인스턴츠 초기화 블록
	
	{
		
		id = ++ counter;
		System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
		
	}
	
	// 생성자 (예금액은 0이고 계좌 개설일은 오늘)
	
	public Account (String name, String no, long balance, Day openDay) {
		
		this.name = name;					// 계좌 명의
		this.no = no;						// 계좌 번호
		this.balance = balance;				// 예금 잔고
		this.openDay = new Day(openDay);	// 계좌 개설일
		
	}
	
	// 계좌 명의 확인
	
	public Account(String name2, String no2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		
		return name;
		
	}
	
	// 식별 번호 가져오기
	
	public int getId() {
		
		return id;
		
	}
	
	// 계좌 개설일 확인
	
	public Day getOpenDay() {
		
		return new Day(openDay);
		
	}
	
	// k원 입금
	
	void withdraw(long k) {
		
		balance -= k;
		
	}
	
	public String toString() {
		
		return "{" + name + ", " + no + ", " + balance + "}";
		
	}
	
}