package T20230504;

public class TimeAccount extends Account {
	
	private long timeBalance;

	public TimeAccount(String name,String no,long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	// 정기예금 잔액 확인
	
	public long getTimeBalance() {
		return timeBalance;
	}

	// 정기예금을 해약하고 전액을 보통예금으로 이체
	
	void cancel() {
		
		deposit(timeBalance);
		timeBalance = 0;
		
	}
	

}
