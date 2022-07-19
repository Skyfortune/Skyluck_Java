package Project_java_chapter_5_8;

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLOGO();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		phone.play();
		phone.playMP3RingTone();
	}

}
