package T20230508;

/**
 * TriangleRB 클래스는 우하가 직각인 이등변 삼각형 클래스이다.
 * 이 클래스는 직각 이등변 삼각형을 나타내는
 * 추상 클래스 AbsTriangle로부터 파생된 클래스이다.
 * 추상 클래스이므로 인스턴스를 생성할 수 없다.
 * 구체적인 직각 이등변 삼각형 클래스는 이 클래스로부터 파생시킨다
 * @autor 시바타
 * @see Shape
 * @see AbstTriangle
 */

public class TriangleRB extends AbstTriangle {
	
	/**
	 * 우하가 직각인 이등변 삼각형을 생성한다.
	 * 한 변의 길이를 인수로 받는다.
	 * @param length 생성할 이등변 삼각형의 한 변의 길이
	 */
	
	public TriangleRB(int length) {
		
		super(length);
		
	}
	
	/**
	 * toString은 우하가 직각인 삼각형의 정보를 문자열로 반환한다.
	 * @return 문자열 "TriangleRB(length:3)"을 반환한다.
	 * 3부분은 길이에 해당하는 값이다
	 */
	
	public String toString() {
		
		return "TriangleRB(length : " + getLength() + ")";
		
	}
	
	/**
	 * draw는 우하가 직각인 삼각형을 그린다
	 * 별표 '*'를 나열해서 그린다
	 */
	
public void draw() {
		
		for (int i = getLength(); i >= 1 ; i--) {
			
			for(int j =1 ; j <= i ; j++)
				System.out.print('*');
				System.out.println();

		}
	}
}