package objects2.annotations;

public class Service {
	@PrintAnnotation()
	String name;
	
	@PrintAnnotation("*")
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation(value = "#", number = 20)
	public void method2() {
		System.out.println("실행 내용2");		
	}
}
