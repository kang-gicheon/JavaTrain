package T20230509;

public class SkinnableRobotPet extends RobotPet implements Skinnable {

	private int skin;

	public SkinnableRobotPet(String name, String masterName, int skin) {
		super(name, masterName);
		this.skin = skin;
	}
	
	public void printSkin(int skin) {
		
		this.skin = skin;
		
	}
	
	public void printSkin() {
		
		switch (skin) {
		
		case BLACK : System.out.print("검정"); break;
		case RED : System.out.print("빨강"); break;
		case GREEN : System.out.print("초록"); break;
		case BLUE : System.out.print("파랑"); break;
		case YELLOW : System.out.print("노랑"); break;
		
		}
		
	}

	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		
	}
	
}
