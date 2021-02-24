package controls;

public class Exercise04 {
	public static void main(String[] args) {
		boolean run = true;
		int n1,n2;
		while (run) {
			n1 = (int)(Math.random() * 6) + 1;
			n2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + n1 + ", " + n2 + ")");

			if ((n1+n2) == 5) {
				run = false;
			}
		}
	}
}
