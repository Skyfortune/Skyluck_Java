package Project_java_chapter_5_8;

interface PhoneInterface {// 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언

	void sendCall(); // 추상 메소드

	void receiveCall(); // 추상 메소드

	default void printLOGO() { // default 메소드
		System.out.println("**Phone**");
	}

	interface MobilePhoneInterface extends PhoneInterface {
		void sendSMS(); // 새로운 추상 메소드 추가

		void receiveSMS();// 새로운 추상 메소드 추가
	}

	interface MP3Interface {
		void play(); // 추상 메소드

		void stop(); // 추상 메소드
	}

	interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {
		void playMP3RingTone(); // 새로운 추상 메소드 추가
	}

}
