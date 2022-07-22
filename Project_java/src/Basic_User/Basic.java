package Basic_User;

public class Basic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1.클래스 사용
		//2.멤버변수 사용
		//3.생성자 사용 - 용도가 뭘까..
		//4.메소드 사용
		
		//5.객체 만들기
		//6.객체 사용
		
		//클래스는 객체변수(=object)를 만드는데 사용한다. 
		//객체변수:객체가 덜 녀석(미생)
		//객체:찐 객체(완생)
		User u1;//1.클래스 사용 //5.객체 만들기 //이건 객체가 아닌데 아래껀 객체다.
		//연결이 끊기면 객체가 끊긴다, =null  사용
		u1 = new User();//3.생성자 사용 //6.객체 사용 //user() - > 생성자 // new User() ->찐객체
		//u1 = null; //객체가 되지 않게 끊어버림, 객체변수가 되어버림
		
	//	User u2= new User();
		u1.name = "홍길동";	//2.멤버변수 사용
		u1.age = 16; 		//2.멤버변수 사용
		u1.printName(); 	//4.메소드 사용
		int age = u1.changeAge(3);	//4.메소드 사용
		System.out.println("보정나이는"+age);
		
		User u2 = new User();
		u2.name = "강감찬";
		u2.age = 55;
		
		User u3 = new User();
		u3.printName();
		u3.printage();
		//디폴트 생성자
	}	
	
	

}
