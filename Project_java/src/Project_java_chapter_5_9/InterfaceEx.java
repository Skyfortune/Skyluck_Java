package Project_java_chapter_5_9;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLOGO();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면" + phone.calculate(3, 5));
		phone.schedule();
	}

}
