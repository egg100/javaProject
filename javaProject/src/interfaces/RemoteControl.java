package interfaces;

public interface RemoteControl {
	static final int MAX_VOLUME = 10; //인터페이스에서는 static final를 안써도 상수 설정가능
	static final int MIN_VOLUME = 0;

	void turnOn(); //추상메소드(구현X)
	void turnOff();
	void setVolume(int volume);
}
