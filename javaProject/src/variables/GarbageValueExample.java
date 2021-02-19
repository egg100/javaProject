package variables;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			// 증감연산자에서는 데이터타입을 변환하지 않고 그대로 연산된다.
			//그래서 byte타입에 값이 계속 저장될 수 있다.
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}

}
