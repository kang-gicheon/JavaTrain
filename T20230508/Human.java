package T20230508;

import T20230502.Day;

/**
 * Human(ver.5) 클래스는 인간 클래스이다.
 * @author 시바타
 */

public class Human {

	// 이름을 나타내는 String형 필드
	
	private String name;
	
	// 신장을 나타내는 int형 필드
	
	private int height;
	
	// 체중을 나타내는 int형 필드
	
	private int weight;
	
	// 생일을 나타내는 Day형 필드
	
	private Day birthday;


	
	/**
	 * 사람 클래스의 Human의 생성자
	 * @param name 이름 문자열
	 * @param height 신장 숫자
	 * @param weight 체중 숫자
	 * @param birthday 생일 날짜
	 */
	
	public Human(String name, int height, int weight, Day birthday) {
		this.name = name; this.height = height;
		this.weight = weight; this.birthday = birthday;
	}


	// 이름을 확인한다
	
	public String getName() { return name; }

	// 신장을 확인한다

	public int getHeight() { return height; }

	// 체중을 확인한다

	public int getWeight() { return weight; }

	// 생일을 확인한다

	public Day getBirthday() { return new Day (birthday); }
	
	/**
	 * 살이 찐다. 인수에 지정한 값만큼 체중이 증가한다.
	 * @param w
	 */
	
	public void gainWeight(int w) {weight += w;}
	
	/**
	 * 살이 빠진다. 인수에 지정한 값만큼 체중이 감소한다.
	 * @param w
	 */
	
	public void reduceWeight(int w) {weight -= w;}
	
	// 이름, 신장, 체중을 표시한다.
	
	public void putData() {
		
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height + "cm");
		System.out.println("체중 : " + weight + "kg");
		
	}
	
	// 문자열 표현을 반환한다.
	
	public String toString() {
		
		return "{" + name + ": " + height + "cm " + weight + "kg "
				+ birthday + "출생}";
		
	}
	
	
}
