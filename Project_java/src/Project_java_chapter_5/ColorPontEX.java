package Project_java_chapter_5;

public class ColorPontEX {
	public static void main(String[] args) {
		Point p = new Point();// point 객체 생성
		p.set(1, 2); // point 클래스의 set()호출
		p.showPoint();
//이러므로 point객체가 생성되어서 pointclass를 불러온다 

		ColorPoint cp = new ColorPoint(); // ColorPoint 객체
		cp.set(3, 4);// point의 set 호출
		cp.setColor("red"); // colorPoint의 setColor()호출
		cp.showColorPoint(); // 컬러와 좌표 출력
	}
}
//최종출력