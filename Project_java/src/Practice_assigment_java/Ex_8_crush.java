package Practice_assigment_java;
import java.util.Scanner;
public class Ex_8_crush {
			//점 4개를 입력하여 직사각형을 구현한다. 
			//그리고 100,100/200,200 의 사각형과 충돌하는지 판별하기
	public  static  boolean  inRect(int x, int y,int rect_x1,int rect_y1, 
            int  rect_x2, int rect_y2) {
		if((x>=rect_x1&&x<=rect_x2)&(y>=rect_y1&&y<=rect_y2))
			//x,y좌표가 만약 rect좌표의 사각형 안에 있다면 ture
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두점(x1,y1), (x2, y2)의 좌표를 입력하시오>>");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		if(inRect(x1,y2,100,100,200,200)||inRect(x2,y2,100,100,200,200)
			||inRect(x1,y1,100,100,200,200)||inRect(x2,y1,100,100,200,200))
			//||는 어느 하나라도 T라면 T로 출력한다. 여기 어느하나라도 사각형에 맞닿거나 안에 있다면 T
			System.out.println("사각형이 겹칩니다.");
		else   
			System.out.println("사각형이 겹치지 않습니다.");
	}
	
	

		
}

