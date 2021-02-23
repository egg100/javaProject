package controls;

public class WhileExample2 {
	public static void main(String[] args) {
		int num = 2;
		while(num <= 9) {
			showResult(num);
			System.out.println("");
			num++;
		}
	} // end of main
	
	public static void showResult(int num) {
		int i = 1;
		while(i <= 9) {
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
		}
	}
}
