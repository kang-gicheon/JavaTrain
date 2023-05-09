package T20230509;

public class Rectange extends Shape implements Plane2D {

	private int width;
	private int height;
	
	public Rectange(int width, int height) {
		
		this.width = width; this.height = height;
		
	}
	
	public String toString() {
		
		return "Rectangle(width : " + width + ", height : " + height + ")";
		
	}
	
	public void draw() {
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) 
				
			System.out.print('*');
			System.out.println();
				
		}
		
	}
	
	public int getArea() {return width = height;}
	
}
