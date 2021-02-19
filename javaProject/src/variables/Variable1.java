package variables;

public class Variable1 {
	public static void main(String[] args) {
		byte b1 = 100;
		short s1 = 10000;
		int i1 = 25600;
		long l1 = 3456700;
		
		byte result1 = (byte) (b1 + 10);
		int result2 = s1 + 100;
		// 연산시 byte타입 데이터여도 int타입으로 바꾸어 연산을 하므로 더한 값을 byte타입에 저장할 수 없다
		//casting해서 데이터타입을 변환해주면 byte에 담을 수 있다.
		int result3 = i1 + 10000;
		long result4 = l1 + 25000;
		//롱형과 인트형을 연산할때는 큰 데이터타입을 기준으로 계산하므로 인트를 롱으로 바꿔서 계산.
		
		System.out.println("결과값은 : " + result4);
		
	}
}
