package Project_java_chapter_3;
import java.util.Scanner;
public class ArrayAccess {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		//배열 선언 5개 생성, 5개 각각 입력 엔터.
		int max = 0;
		//max값 처음에는 0으로
		
		for(int i = 0; i<5; i++) {
			//시작은 0부터, i가 5보다 작으면 종료, 루프마다 1씩 증가
			//배열을 5개로 선언했으니까, 루프는 5번하고 끝남.
			intArray[i] = in.nextInt();
			//in입력값으로 수열을 생성.
			if (intArray[i] > max)
				max = intArray[i];
			//입력값이 맥스보다 크다? 그러면 맥스값은 그 값으로 변경
			//작은것은 맥스로 되지 못하니까, 맥스는 가장 큰 수만 남게된다. 
		}
		System.out.print("입력된 수에서 가장 큰 수는 "+max+"입니다.");
	}	
}
