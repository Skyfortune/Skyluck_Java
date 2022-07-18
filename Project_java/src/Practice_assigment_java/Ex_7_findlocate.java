package Practice_assigment_java;
import java.util.Scanner;
public class Ex_7_findlocate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점(x,y)의 좌표를 입력하시오>>");

		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>=100 && y>=100 && x<=200 && y<=200)
			System.out.print("("+x+","+y+")는 사각형 안에 있습니다.");
		else
			System.out.print("("+x+","+y+")는 사각형 안에 없습니다.");
		
		
		
		
		
	}
}
