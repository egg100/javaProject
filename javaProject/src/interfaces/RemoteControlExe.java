package interfaces;
class DvdPlayer implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	
}

public class RemoteControlExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//익명구현객체.
		rc = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("DVD를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("DVD를 끕니다");
				
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("DVD볼륨 " + volume);
			}
		};
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
	}
}
