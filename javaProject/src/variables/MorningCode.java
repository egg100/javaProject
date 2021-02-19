package variables;

public class MorningCode {

	public static void main(String[] args) {
		int standard = 30;
		int myAge = 26;
		
		if (standard < myAge) {
			System.out.println("나이가 좀 들었습니다.");
		} else if (standard > myAge) {
			System.out.println("한창이네요.");
		} else {
			System.out.println("적정한 나이입니다.");
		}
	}

}
