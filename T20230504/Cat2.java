package T20230504;

public class Cat2 extends Animal {

	private int age;
	
	public Cat2(String name, int age) {
		
		super(name); this.age = age;
		
	}
	
	public void bark() {System.out.println("냐옹!");}
	
	
	public String toString() {
		
		return age + "의" + getName();
	}
}
