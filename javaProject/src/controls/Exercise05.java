package controls;

public class Exercise05 {
	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if(4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
//-----------------------------------------------------------------------
		int sNum = 35;
		int eNum = 60;
		int result = getSumValue(sNum, eNum);
		System.out.println(sNum + "과 " + eNum + "사이의 합: " + result);
		sNum = 44;
		eNum = 67;
		result = getSumValue(sNum, eNum);
		System.out.println(sNum + "과 " + eNum + "사이의 합: " + result);
		
	}
	//임의의 값 두수를 포함한 사이 값의 합을 구하기 (3가지 방법)
	
//	public static int getSumValue(int n1, int n2) {
//		int startNum = (n1 < n2) ? n1 : n2;
//		int endNum = (n1 < n2) ? n2 : n1;
//		int sum = 0;
//		for (int i = startNum; i <= endNum; i++) {
//			sum+= i;
//		}
//		return sum;
//	}
	
//	public static int getSumValue(int n1, int n2) {
//		int sum = 0;
//		if(n1 > n2) {
//			for (int i = n1; i >= n2; i--) {
//				sum+= i;
//			}
//		} else {
//			for (int i = n1; i <= n2; i++) {
//				sum+= i;
//			}
//		}
//		return sum;
//	}
	
	public static int getSumValue(int n1, int n2) {
		int sum = 0;
		if(n1 < n2) {
			for (; n1 <= n2; n1++) {
				sum+= n1;
			}
		} else {
			for (; n2 <= n1; n2++) {
				sum+= n2;
			}
		}
		return sum;
	}
}
