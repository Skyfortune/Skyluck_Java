package Basic_User;

public class User { //1-1.클래스 만들기

	//클래스 만들 때, 구성하는 멤버 3가지(옵션, 필수 아님)
	//1) 멤버 변수 만들기
	//2) 생성자(메소드) 만들기
	//3) (일반멤버)메소드 만들기
	//2-1. 객체 만들기???? 는 언제??
	String name;
	int 	age;
	
	//1) 멤버 변수 만들기
//	String name = "손흥민";   //이러면 안된다, 값을 여기에 넣으면 안된다. 
//	int 	age = 29; //멤버 변수
	//2) 생성자(메소드) 만들기
	//->역활 : 멤버 변수의 초기화(초기값 설정)
	User()
	{
		name = "";
		age = 10;
		System.out.println("생성자입니다!");
	}
	//3) (일반멤버)메소드 만들기
	void printName() 
	{
		System.out.println("이름은 " + name);
	}
	void printage() 
	{
		System.out.println("나이는 " + age);
	}
	int changeAge(int gap) //변수
	{
		int new_age=0; //지역변수
		new_age = age + gap;
		
		return new_age;
	}
}
