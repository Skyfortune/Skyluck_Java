package Project_java_chapter_5_3;

public class Point {
	private int x, y; // 한 점을 구성하는 x,y좌표
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {//점의 좌표 출력
		System.out.println("("+x+","+y+")");
	}
}
