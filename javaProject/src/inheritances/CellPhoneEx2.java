package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		// cp = (CellPhone) new DmbPhone(); // int = (int) byte;
		// 자식 클래스 인스턴스는 부모 클래스 인스턴스에 담길수 있고 자동 형변환 됨
//		cp = (CellPhone) new SmartPhone();
		cp.color = "";
		
		if(cp instanceof DmbPhone) {			
			DmbPhone dp = (DmbPhone) cp;
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		} else {
			System.out.println("Casting할수없습니다");
		}
		
		// 다형성.
		// 부모 = 자식들...
		// 부모.메소드 = 자식.메소드;
		cp = new DmbPhone();
		cp.powerOn();
		cp = new SmartPhone();
		cp.powerOn();
	}
}
