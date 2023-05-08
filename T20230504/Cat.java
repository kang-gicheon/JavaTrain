package T20230504;

public class Cat extends Animal {

	private int age;
	
	public Cat(String name, int age) {
		
		super(name); this.age = age;
		
	}
	
	public void bark() {System.out.println("냐옹!");}
	
}
