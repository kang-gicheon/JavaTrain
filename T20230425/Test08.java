package T20230425;

import java.util.Random;
import java.util.Scanner;

public class Test08 {
	
	// 암산 훈련 (3개의 3자리 정수를 사용한 계산)
	
	static Scanner stdin = new Scanner(System.in);
	
	// 계속할지 여부 확인을 작성

	static boolean confirmRetry() {
		int cont; do {
			System.out.print("다시 한 번? <Yes...1/No...0> : ");
			cont = stdin.nextInt();
		} while (cont != 0 && cont != 1);
		
		return cont == 1;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		System.out.println("암산 훈련!!");
		
		do {
			int x = rand.nextInt(990) + 100; // 3자리 수
			int y = rand.nextInt(990) + 100; // 3자리 수
			int z = rand.nextInt(990) + 100; // 3자리 수
			int pattern = rand.nextInt(4);
			
			int answer;
			switch (pattern) {
			case 0 : answer = x + y + z; break;
			case 1 : answer = x + y - z;break;
			case 2 : answer = x - y + z; break;
			default : answer = x - y - z; break;
			}
			
			while(true) {
				System.out.print(x + ((pattern < 2)     ? " + " : " - ") +
				y + ((pattern % 2 == 0) ? " + " : " - ") +
				z + " = ");
				
				int k = stdin.nextInt();
				if (k == answer)
					break;
				System.out.println("틀렸습니다!");
			}
		} while (confirmRetry());

	}

}
