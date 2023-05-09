package T20230509;

public class RobotPet extends Pet {

	public RobotPet(String name, String masterName) {
		
		super(name, masterName);
		
	}
	
	// 자기소게
	
		public void introduce() {
			
			System.out.println("◇나의 로봇! 이름은 " + getName() + ".");
			System.out.println("◇주인님의 이름은 " + getMasterName() + ".");
			
		}
		
	public void work(int sw) {
		
		switch (sw) {
		
		case 0 : System.out.println("청소를 합니다."); break;
		case 1 : System.out.println("세탁을 합니다."); break;
		case 2 : System.out.println("밥을 합니다."); break;
		
		}
		
	}
	
}
