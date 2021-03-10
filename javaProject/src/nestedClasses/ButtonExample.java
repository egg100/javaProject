package nestedClasses;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		//익명객체로 인터페이스 구현
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("영상을 보냅니다.");
			}
		});
		// 람다 표현식으로 더 간결하게도 가능
//		btn.setOnClickListener(() -> System.out.println("영상을 보냅니다."));
		btn.touch();
	}
}
