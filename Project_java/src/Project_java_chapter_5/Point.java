package Project_java_chapter_5;

public class Point {

	private int x, y; // 한 점을 구성하는 x,y좌표

	public void set(int x, int y) { //메인에서 받음
		this.x = x;
		this.y = y;
	}

	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}//마찬가지로 메인에서 받아옴
}

//부모클래스