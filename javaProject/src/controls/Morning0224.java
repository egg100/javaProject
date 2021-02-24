package controls;

public class Morning0224 {
	public static void main(String[] args) {
		int english, math;
		String grade;
		english = (int)(Math.random() * 100) + 1;
		math = (int)(Math.random() * 100) + 1;
		grade = getAverage(english, math);
		System.out.println("영어: " + english + ",수학: " + math + ",평균성적: " + grade);
	} // end of main

	public static String getAverage(int n1, int n2) {
		double average = (n1 + n2) / 2.0;
		String grade;
		if(average >= 90) {
			grade = "수";
		} else if (average >= 80) {
			grade = "우";
		} else if (average >= 70) {
			grade = "미";
		} else {
			grade = "가";		
		}
		return grade;
		
	}
}
