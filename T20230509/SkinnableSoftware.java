package T20230509;

public class SkinnableSoftware implements Skinnable {

	int skin;		// 스킨
	
	// 생성자
	
	public SkinnableSoftware() {this.skin = BLACK;}
	public SkinnableSoftware(int skin) {this.skin = skin;}
	
	public void changeSkin(int skin) {this.skin = skin;}
	public int getSkin( ) {return skin;}
	public String getSkinString() {
		
		switch (skin) {
		
		case BLACK : return "BLACK";
		case RED : return "RED";
		case GREEN : return "GREEN";
		case BLUE : return "BLUE";
		case YELLOW : return "YELLOW";
		
		
		}
		
		return "";
		
	}
}
