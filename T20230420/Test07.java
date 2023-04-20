package T20230420;

public class Test07 {

	public static void main(String[] args) {
		
		double[] a = new double[5];
		
		for (int i = 0 ; i < a.length; i++)
			a[i] = (i+1) * 1.1;
		
		for (int i = 0 ; i < a.length ; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
