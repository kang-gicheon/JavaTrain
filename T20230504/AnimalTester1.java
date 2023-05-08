package T20230504;

public class AnimalTester1 {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[2];
		
		a[0] = new Dog("뭉치", "치와와");
		a[1] = new Cat("마이클", 7);
		
		for (Animal s : a) {
			
			System.out.print(s.getName() + " ");
			s.bark();
			System.out.println();
			
		}

	}

}
