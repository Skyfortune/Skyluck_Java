package Project_java_chapter_5;

class ColorPoint extends Point {
	private String color; // 점의 색

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {// 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();// point 클래스의 showPoint()호출
	}
}
//자식클래스