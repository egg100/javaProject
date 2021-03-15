package lambdaExpression;

@FunctionalInterface
interface MyFunctionInterface {
	void run(String str);
}

public class FunctionalExample2 {
	public static void main(String[] args) {
		MyFunctionInterface mfi = new MyFunctionInterface() {
			@Override
			public void run(String str) {
				System.out.println(str + "을 실행합니다.");
			}
		};
		mfi.run("run()");
		mfi.run("call()");
		
		MyFunctionInterface mfi2 = (str) -> System.out.println(str + " 실행");
		mfi2.run("dd");
	}
}
