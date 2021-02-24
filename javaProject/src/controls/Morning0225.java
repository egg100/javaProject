package controls;

public class Morning0225 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=11; i <= 30; i++) {
			sum = sum + i;
		}
		System.out.println("합: " + sum);
		
		int startNum = 11;
		int endNum = 30;
		sum = 0;
		for(int i = startNum; i <= endNum; i++) {
			sum = sum + i;
		}
		System.out.println("합: " + sum);
		
		sum = getSum(11, 30);
		System.out.println("합: " + sum);
	}
	
	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		for(int i = fromValue; i <= toValue; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
