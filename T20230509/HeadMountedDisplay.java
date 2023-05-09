package T20230509;

public class HeadMountedDisplay implements Wearable, Skinnable {

	private int skin;
	
	// 착용
	
	public void putOn() {
		
		System.out.println("디스플레이를 착용했습니다");
		
	}
	
	// 해제
	
	public void putOff() {
		
		System.out.println("디스플레이를 벗었습니다.");
		
	}
	
	// 현재 스킨 표시
	
	public void putSkin() {
		
		switch (skin) {
		
		case BLACK : System.out.println("BLACK DISPLAY"); break;
		case RED : System.out.println("RED DISPLAY"); break;
		case GREEN : System.out.println("GREEN DISPLAY"); break;
		case BLUE : System.out.println("BLUE DISPLAY"); break;
		case YELLOW : System.out.println("YELLOW DISPLAY"); break;
		
		}
		
	}

	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		
	}
	
}
