package Project_java_chapter_5_6;

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은" + weapon.fire());
		//이때 기본적인 부모 클래스를 불러왔다

		weapon = new Cannon();
		//여기서 캐논 클래스에 오버라이딩된 웨폰 객체를 불러왔음
		System.out.println("대포의 살상 능력은" + weapon.fire());
		//출력은 대포의 클래스, 자식 클래스가 왔다. 이름은 웨폰인데도,
	}
}
