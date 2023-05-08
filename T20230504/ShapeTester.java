package T20230504;

import java.util.Iterator;
import java.util.Scanner;

public class ShapeTester {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("도형의 개수 : ");
		int no = stdin.nextInt();
		Shape[] p = new Shape[no];
		
		for (int i = 0; i < no; i++) {
			
			int type;
			
		do {
			
			System.out.print((i + 1) + "번 도형의 종류(1..점/2..수평선" +
			"/3..수직선/4..사각형) : ");
		}while (type < 1 || type > 4);
			
		switch (type) {
		
		case 1: p[i] = new Point();
			break;
		case 2 :
		case 3 : System.out.print("길이는 : ");
				 int len = stdin.nextInt();
				 p[i] = (type == 2) ? new HorzLine(len) : new VertLine(len);
				 break;
		case 4 : System.out.print("너비 : ");
				 int width = stdin.nextInt();
				 System.out.print("높이 : ");
				 int height = stdin.nextInt();
				 p[i] = new Rectangle(width, height);
				 break;
		
		}
		
		}

		for (Shape s : p)
			s.print();
			System.out.println();
	}

}
