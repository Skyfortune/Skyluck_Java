package C4_7;

public class AccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample aClass = new Sample();
		aClass.a = 10;
//		aClass.b = 10;
		//private으로 설정되어 있어서 이 클래스에서는 접근이 불가능
		aClass.setB(10);
		//클래스 내부에 getB()/setB() 메소드 만들어서 접근가능
		aClass.c = 10;
	}

}
