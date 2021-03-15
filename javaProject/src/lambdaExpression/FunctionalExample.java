package lambdaExpression;
interface MyFunctionalInterface {
	void run(); // 구현해야할 메소드가 하나만 있는 인터페이스 : FunctionalInterface
}

class MyFunctionClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}
}

public class FunctionalExample {
	public static void main(String[] args) {
//		MyFunctionalInterface mif = new MyFunctionClass();
		MyFunctionalInterface mif = new MyFunctionalInterface() {
			@Override
			public void run() {
				System.out.println("run()를 실행합니다.");
			}
		};
		mif.run();
		
		mif = () -> System.out.println("run() 메소드를 실행합니다.");
		
		mif.run();
	}
}
