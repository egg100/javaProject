package variables;

public class Variable1 {
	public static void main(String[] args) {
		byte b1 = 100;
		short s1 = 10000;
		int i1 = 25600;
		long l1 = 3456700;
		
		byte result1 = (byte) (b1 + 10);
		int result2 = s1 + 100;
		// ����� byteŸ�� �����Ϳ��� intŸ������ �ٲپ� ������ �ϹǷ� ���� ���� byteŸ�Կ� ������ �� ����
		//casting�ؼ� ������Ÿ���� ��ȯ���ָ� byte�� ���� �� �ִ�.
		int result3 = i1 + 10000;
		long result4 = l1 + 25000;
		//������ ��Ʈ���� �����Ҷ��� ū ������Ÿ���� �������� ����ϹǷ� ��Ʈ�� ������ �ٲ㼭 ���.
		
		System.out.println("������� : " + result4);
		
	}
}
