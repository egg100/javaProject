package generics;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str = Utils.compare("a", "b");
		
		int result1 = Utils.compare(100, 20);
		System.out.println(result1);
		
		int result2 = Utils.compare(4.5, 3);
		System.out.println(result2);
	}
}
