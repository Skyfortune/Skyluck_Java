package Project_java_chapter_5_8;

class SamsungPhone implements PhoneInterface {// 인터페이스 구현
	// PhoneInterface의 모든 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
	public void play() {
		System.out.println("음악이 재생됩니다.");
	}
	public void sendSMS() {
		System.out.println("문자를 보낼 수 있습니다.");
	}
	public void reseiveSMS() {
		System.out.println("문자를 받을 수 있습니다");
	}
	public void stop() {
		System.out.println("재생중인 음악을 종료합니다");
	}
	public void playMP3RingTone() {
		System.out.println("벨소리를 지정합니다.");
	}
}
