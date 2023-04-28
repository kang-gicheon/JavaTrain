package T20230428;

public class Test02_class {

	private String name;	// 이름
	private	int height;		// 신장
	private int weight;		// 체중
	
	// 생성자

	
	Test02_class(String n, int h, int w) {
		
	name = n ; height = h ; weight = w;
	
	}
	
	String getName() {return name;}		// 이름 가져오기
	int getHeight() {return height;}	// 신장 불러오기
	int getweight() {return weight;}	// 체중 불러오기
	
	
	void gainWeight(int w) {weight += w;}
	void reduceight(int w) {weight -= w;}
	
}
