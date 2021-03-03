package objects2;

public class Calculator {
	double pi = 3.14;

	public double getArea(double radius) {
		double result = pi * radius * radius;
		return result;
	}

	// static은 클래스의 인스턴스를 생성하지 않아도 사용할수 있다. 정적멤버
	// 인스턴스 생성전에 힙 영역에 만들어져 사용할 준비가 되어져 있다.
	public static double getRect(double d1, double d2) {
		double result = d1 * d2;
		return result;
	}
}
