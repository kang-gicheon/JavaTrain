package T20230509;

public class SkinnableRobotPetTester {

	static void intro(Pet p) {
		
		p.introduce();
		
	}
	
	public static void main(String[] args) {
		
		Pet[]a = {
				
			new Pet("Kurt","아이"),
			new RobotPet("R2D2", "루크"),
			new SkinnableRobotPet("OSX5","Apple",Skinnable.YELLOW),
			new Pet("마이클","영남"),
				
		};
		
		for(Pet p : a) {
			
			intro(p);
			
		if(p instanceof SkinnableRobotPet) {
			
			System.out.print("스킨은 ");
			((SkinnableRobotPet)p).printSkin();
			System.out.println("입니다.");
		}
			
		System.out.println();
		
		}
	}

}
