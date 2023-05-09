package T20230509;

public class Pet {

	private String name;			// 애완견 이름
	private String masterName;		// 주인 이름
	
	
	public Pet(String name, String masterName) {
	
		this.name = name;					// 애완견 이름
		this.masterName = masterName;		// 주인 이름
	}

	// 애완견 이름 확인
	
	public String getName() {return name;}


	public String getMasterName() {return masterName;}
	
	// 자기소게
	
	public void introduce() {
		
		System.out.println("■나의 이름은 " + name + "입니다.");
		System.out.println("■주인님의 이름은 " + masterName + "입니다.");
		
	}
	
}
