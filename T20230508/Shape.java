package T20230508;

/**
 * Shape 클래스는 도형의 개념을 나타내기 위한 추상 클래스이다.
 * 추상 클래스이므로 이 클래스의 인스턴스를 생성할 수 없다.
 * @author 시바타
 * @see object 
 */

public abstract class Shape {

	private int length;

	/**
	 * 도형 정보를 나타내는 문자열을 반환하는 추상 메서드이다.
	 * shape 클래스에서 파생되는 클래스에서 이 메서드를 구현한다.
	 * 이 메서드는 java.lang.object 클래스의 메서드를 추상 메서드로
	 * 오버라이드한 메서드이다.
	 */
	
	 public abstract String toString();
	 
	 /**
	  * draw 메서드는 도형을 그리기 위한 추상 메소드이다.
	  * Shape 클래스에서 파생되는 클래스에서 이 메서드를 구현한다.
	*/
	 public abstract void draw();
	 
	 /**
	  *  print 메서드는 도형 정보의 표시하고 도형 자체를 그린다.
	  *  구체적으로는 다 음 두 단계를 따른다.
	  *  step 1. toString 메서드가 반환하는 문자열을 표시하고 줄 바꿈
	  *  step 2. draw 메서드를 호출해서 도형을 그림
	  */
	 
	 public void print() {
		 
		 System.out.println(toString());
		 draw();
		 
	  }
} 
	
	 /**
	  *  point 클래스는 점을 나타내는 클래스이다.
	  *  이 클래스는 도형을 나타내는 추상 클래스 Shape로부터 파생된 클래스이다.
	  *  필드는 없다.
	  *  @author 시바타
	  *  @see Shape
	  */
	 
	  class Point extends Shape {
		 
		 /**
		  * 점을 생성하는 생성자이다.
		  *  받는 인수가 없다
		  */
		 
		 public Point() {
		 // 아무것도 하지 않는다
	 }

		 /**
		  * toString 메서드는 점에 관련된 도형 정보를 문자열로 반환한다.
		  * 반환하는 문자열은 항상 "Point"이다.
		  * @return 문자열 "Point"를 반환하다.
		  */
		 
		@Override
		public String toString() {
			
			return "Point";
			
		}

		/**
		 * draw 메서드는 점을 그리는 메서드이다.
		 * 플러스 기호 '+'를 1개만 표시하고 줄 바꿈한다 
		 */
		
		public void draw() {
			
			System.out.println('+');
			
			}
	 }
	 
	 /**
	  * AbsLine 클래스는 직선을 나타태는 추상 클래스이다.
	  * 이 클래스는 도형을 나타내는 추상 클래스 Shape로부터 파생되는 클래스이다.
	  * 추상 클래스이므로 본 클래스의 인스턴스를 생성할 수 없다.
	  * 구체적인 직선 클래스는 이 클래스를 통해 파생된다.
	  * @author 시바타
	  * @see Shape
	  * @see HorzLine VertLine
	  */
	 
	  abstract class AbstLine extends Shape {
		 
		 /**
		  * 직선의 길이를 나타내는 int형 필드
		  */
		 
		 private int length;
		 
	 
	 
	 /**
	  * 직선을 생성하는 생성자이다.
	  * 길이를 인수로 받는다.
	  * @param length 생성할 직선의 길이
	  */
	
	 public AbstLine(int length) {
		 
		 setLength(length);
		 
	 }
	 
	 /**
	  * 직성의 길이를 반환한다.
	  * @return 직선의 길이
	  */
	 
	 public int getLength() {
		 
		 return length;
		 
	 }
	 
	 /**
	  * 직선의 길이를 설정한다/
	  * @param length  설정할 직선의 길이
	  */
	 
	  public void setLength(int length) {
		  
		  this.length = length;
		  
	  }
	  
	  /**
	   * toString 메서드는 직선에 관련된 도형 정보를 문자열로 반환한다.
	   * @return 문자열 "AbsLine(length:3)"을 반환한다.
	   * 3 부분은 길이에 해당하는 값이다.
	   */
	  
	  public String toString() {
		  
		  return "AbstLine(length : " + length + ")";
		  
	  	}
	  }
	  
	  /**
	   * HorzLine 클래스는 수평을 나타내는 클래스이다.
	   * 이 클래스는 직선을 나타내는 추상 클래스 AbsLine에서 파생된 클래스이다.
	   * @author  시바타
	   * @see Shape
	   * @see AbstLine
	   */
	  
	  class HorzLine extends AbstLine {
		  
		  /**
		   * 수평선을 생성하는 생성자이다.
		   * 길이를 인수로 받는다.
		   * @param length 생성할 직선의 길이
		   */
		  
		public HorzLine(int length) {
			
			super(length);
			
		}
		  
		/**
		 * toString 메서드는 수평선에 관련된 도형 정보를 문자열로 반환한다.
		 * @return 문자열 :HorzLine(length:3)"을 반환한다.
		 * 3부분은 길이에 해당하는 값이다.
		 */
		
		public String toString() {
			
			return "HorzLine(length : " + getLength() + ")";
			
		}
		
		/**
		 * draw 메서드는 수평선을 그린다.
		 * 마이너스 기호 '-'를 옆으로 나열해서 그린다.
		 * 길이의 개수만큼 '-'를 연속으로 표시한 후 줄 바꿈한다.
		 */
		
		public void draw() {
			
			for (int i = 1; i <= getLength(); i++) {
				System.out.print('-');
				System.out.println();
			}
			
		}
		
		/** 
		 * VertLine 클래스는 수직선을 나타내는 클래스이다.
		 * 이 클래스는 직선을 나타내는 추상 클래스 AbstLine로부터 파생된 클래스이다.
		 * @author 시바타
		 * @see Shape
		 * @see AbstLine
		 */
		
		public class VertLine extends AbstLine {
			
			/**
			 * 수직선을 생성하는 생성자이다.
			 * 길이를 인수로 받는다.
			 * @param length 생성할 직선의 길이
			 */
			
			public VertLine(int length) {
				
				super(length);
				
			}
			
			/**
			 * toString 메서드는 수직선에 관련된 정보를 문자열로 반환한다.
			 * @return 문자열 "VertLine(length:3)"를 반환한다.
			 * 3부분은 길이에 해당하는 값이다.
			 */
			
			public String toString() {
				
				return "VertLine(length : " + getLength() + ")";
				
			}
			
			/**
			 * draw 메서드는 수직선을 그린다.
			 * 세로선 기호 '|'를 세로로 나열해서 그린다.
			 * 길이의 개수만큼 '|'를 표시한 후 줄 바꿈하는 것을 반혹한다.
			 */
			
			public void draw() {
				
				for (int i = 1; i <= getLength(); i++) {
				System.out.println('|');	
					
				}
				
			}
			
			/**
			 * Recatangle 클래스는 사각형을 나타내는 클래스이다.
			 * 이 클래스는 도형을 나타내는 추상 클래스 Shape에서 파생된 클래스이다.
			 * @author 시바타
			 * @see Shape
			 */
			
			public class Rectangle extends Shape {
				
				/**
				 * 사각형의 너비를 나타내는 int형 필드이다.
				 */
				
				private int width;
				
				/**
				 * 사각형의 높이를 나타내는 int형 필드이다.
				 */
				
				private int height;
				
				/**
				 * 사각형을 생성하는 생성자이다.
				 * 너비와 높이를 인수로 받는다.
				 * @param width 사각형의 너비
				 * @param height 사각형의 높이
				 */
				
				public Rectangle(int width, int height) {
					
					this.width = width; this.height = height;
					
				}
				
				/**
				 * toString 메서드는 사각형에 관련되 ㄴ도형 정보를 문자열로 반환한다.
				 * @return 문자열 "Recatangle(width:4, height:3)"을 반환한다.
				 * 4와 3부분은 각각 너비와 폭에 해당하는 값이다.
				 */
				
				public String toString() {
					
					return "Recatangle(width : " + width + ", height" + height + ")";
					
				}
				
				/**
				 * draw 메서드는 사각형을 그린다.
				 * 별표 '*'를 나열해서 그린다.
				 * 너비의 개수만큼 '*'를 표시하고 줄 바꿈하는 것을 width회만큼 반복한다.
				 */
				
				public void draw() {
					
					for (int i = 0; i <= height; i++) {
						for (int j = 0; j <= width; j++) 
							
						System.out.print('*');
					System.out.println();
						
					}
					
				}
				
			}
			