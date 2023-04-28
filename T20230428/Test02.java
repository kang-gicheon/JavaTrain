package T20230428;

public class Test02 {

	public static void main(String[] args) {
		
		Test02_class gildong = new Test02_class("길동", 170, 60);
		Test02_class chulsu = new Test02_class("철수", 166, 72);
		
		gildong.gainWeight(3);	// 길동이 3kg 쪘다
		chulsu.reduceight(5);	// 철수가 5kg 빠졌다

		System.out.println("이름 : " + gildong.getName());
		System.out.println("신장 : " + gildong.getHeight() + "cm");
		System.out.println("체중 : " + gildong.getweight() + "kg");
		System.out.println();
		
		System.out.println("이름 : " + chulsu.getName());
		System.out.println("신장 : " + chulsu.getHeight() + "cm");
		System.out.println("체중 : " + chulsu.getweight() + "kg");
		
	}

}
