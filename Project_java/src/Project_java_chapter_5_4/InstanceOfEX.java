package Project_java_chapter_5_4;

public class InstanceOfEX {
	static void print(Person p) {
		// person p를 출력한다
		if (p instanceof Person) // 종속이되는지 물어보는 if문
			System.out.println("person");
		// 다르게 말하면 p는 person인가? -> yes
		if (p instanceof Student)
			System.out.println("Student");
		if (p instanceof Reseracher)
			System.out.println("Reseracher");
		if (p instanceof professor)
			System.out.println("professor");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() ->t");
		print(new Student());
		System.out.print("new Researcher()->t");
		print(new Reseracher());
		System.out.print("new Professor()->");
		print(new professor());
		// 교수를 입력했더니 리서쳐도 나왔다
		// new professor() 객체는 person 타입 이기도 하고, researsher,professor
		// 이기도 하니까
	}
}
