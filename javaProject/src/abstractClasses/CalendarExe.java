package abstractClasses;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		showCal(2021, 5);
	}
	
	public static void showCal(int year, int month) {
		//달력만들기.
		System.out.println(year + "년 " + month + "월");
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
//		System.out.println("-------------------------------------");
////				cal.set(2021, 5, 1);  cal 변수 값 => 2021년 6월 1일
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		
//		//d는 숫자 s는 스트링
//		System.out.printf("%3d", 9);
//		System.out.printf("%3d", 10);
//		System.out.printf("%5s", "sun");
//		System.out.printf("%5s", "Monday");
		
		System.out.println("=====================================");
		
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		for(int i = 0; i < lastDate + firstDay; i++) {
			if(i < firstDay) {
				System.out.print("   ");
			} else {
				System.out.printf("%3d", i - firstDay + 1);				
			}
			if(i%7 == 0) {
				System.out.println();
			}
		}
	}
}
