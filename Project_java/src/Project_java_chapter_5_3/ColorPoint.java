package Project_java_chapter_5_3;

public class ColorPoint extends Point {
	private String color; // 점의 색

	public ColorPoint(int x, int y, String color) {
		super(x, y); // point의 생성자 point(x,y)호출
		this.color = color;
	}

	public void showColorPoint() {//컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();//Point class 의 show Point() 호출
	}

}
