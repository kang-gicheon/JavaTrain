package T20230509;

public class WearableTester {

	public static void main(String[] args) {
		
		Wearable[]a = new Wearable[2];
		
		a[0] = new Headphone();				//헤드폰
		a[1] = new WearableComputer();		//웨어러블 컴퓨터
		
		for (int i = 0; i < a.length; i++) 
			
			a[i].putOn();
			
		
	
		for (int i = 0; i < a.length; i++) 
			
			a[i].putOff();
			
		
	}

}
