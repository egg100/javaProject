package variables;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			// ���������ڿ����� ������Ÿ���� ��ȯ���� �ʰ� �״�� ����ȴ�.
			//�׷��� byteŸ�Կ� ���� ��� ����� �� �ִ�.
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}

}
