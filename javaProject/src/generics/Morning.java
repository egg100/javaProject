package generics;

public class Morning {
	public static void main(String[] args) {
		checkGender("0112233456678");
		checkGender("011223-3456678");
		System.out.println(sum("1000", "2000"));
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	
	}
	
	public static String sum(String a, String b) {
		String sum = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
		StringBuilder change = new StringBuilder(sum);
		int index = change.length() - 3;
		if(sum.length() > 3) {
			String result = change.insert(index, ",").toString();
			return result;
//			String c = String.valueOf(sum.charAt(sum.length()-3));
//			return sum.replace(c, "," + c);
		}
		return "";
	}
	
	public static String checkGender(String j) {
		String r = j.replace("/", "").replace("-", "").replace("*", "");
		char check = r.charAt(6);
//		char check = j.charAt(j.length()-7);
		if(check == '1' || check == '3') {
			System.out.println("남자");
			return "남자";
		} else if(check == '2' || check == '4') {
			System.out.println("여자");
			return "여자";
		} else {	
			System.out.println("잘못된 입력입니다.");
			return "잘못된 입력입니다.";
		}
	}
}
