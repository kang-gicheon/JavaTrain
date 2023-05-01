package T20230501;

import java.util.Scanner;

public class AccountTester2 {

	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("계좌 정보를 입력하세요.");
		System.out.print("명    의 : ");
		String name = stdin.next();
		System.out.print("번   호 : ");
		String no = stdin.next();
		System.out.print("잔   고 : ");
		long balance = stdin.nextLong();
		System.out.print("개설 연도 : ");
		int y = stdin.nextInt();
		System.out.print("개설   월 : ");
		int m = stdin.nextInt();
		System.out.print("개설   일 : ");
		int d = stdin.nextInt();
		
		Account a = new Account(name, no, balance,new Day(y,m,d));
		
		System.out.println("계좌 기본 정보 : " + a);
		System.out.println("개설일 : " + a.getopenDay().toString());
	}

}
