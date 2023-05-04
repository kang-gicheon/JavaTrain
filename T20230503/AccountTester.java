package T20230503;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("계좌 개설 수 : ");
		int n = stdin.nextInt();
		Account[]a = new Account[n];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print("[0]...간이 [1]...상세 : ");
			int type = stdin.nextInt();
			
			System.out.println("계좌 정보를 입력하세요.");
			System.out.print("명  의 : "); String name = stdin.next();
			System.out.print("번  호 : "); String no = stdin.next();
			
			if(type == 0)
				a[i] = new Account(name,no);
			else {
				
				System.out.print("잔  고 : "); int balance = stdin.nextInt();
				System.out.print("개설 연도 : "); int y = stdin.nextInt();
				System.out.print("개설 월 : "); int m = stdin.nextInt();
				System.out.print("개설 일 : "); int d = stdin.nextInt();
				
				a[i] = new Account(name, no, balance, new Day(y,m,d));
				
			}
			
			
			System.out.println("계좌 기본 정보 : " + a[i]); int y = stdin.nextInt();
			System.out.println("식별 번호 : " + a[i].getId()); int m = stdin.nextInt();
			System.out.println("계설 일 : " + a[i].getOpenDay()); int d = stdin.nextInt();
			
		}

	}

}
