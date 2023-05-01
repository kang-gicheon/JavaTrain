package T20230501;

public class Human2 {

	private static int counter = 0;
	private String name; // 이름
	private int height; // 신장
	private int weight; // 체중
	private int id; // 식별 번호
	
	// 생성자
	
	public Human2(String name, int height, int weight)  {

	this.name = name;	this.height = height;this.weight = weight; 
	id = ++counter;
	
}
		
	
	String getName() {return name; } // 이름 가져오기
	int getHeight() { return height; } // 신장 불러오기
	int getweight() { return weight; } // 체중 불러오기
	
	
	void gainWeight(int w)	{weight += w; } // 살이 찐다
	void reduceWeight(int w)	{weight -= w; } // 살이 빠진다

	
	public int getId() { return id;}
	
	public void putData() {
		
		// 데이터 표시
		
		System.out.println("이름 : " +name);
		System.out.println("신장 : " +height + "cm");
		System.out.println("체중 : " +weight + "kg");
	}
	
	
	}

	
