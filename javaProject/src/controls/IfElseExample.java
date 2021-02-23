package controls;

public class IfElseExample {

	public static void main(String[] args) {
		String grade = "F";
		int score = 99;
		
//		if (score >= 90) {
//			if (score >= 95) {
//				grade = "A+";
//			} else {
//				grade = "A";
//			}
//		} else if (score >= 80) {
//			if (score >= 85) {
//				grade = "B+";
//			} else {
//				grade = "B";
//			}
//		} else if (score >= 70) {
//			if (score >= 75) {
//				grade = "C+";
//			} else {
//				grade = "C";
//			}
//		} else {
//			grade = "F";
//		}
		
		switch(score / 10) {
		case 9:
			grade = "A"; break;
		case 8:
			grade = "B"; break;
		case 7:
			grade = "C"; break;
		default:
			grade = "F";
		}
		
		System.out.println("점수 " + score + "(은)는 " + grade + " 입니다.");
	}

}
