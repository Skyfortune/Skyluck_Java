package Project_java_chapter_3;
import java.util.Scanner;
public class WhileSample {
	public static void main (String[] args) {
	Scanner rd = new Scanner(System.in);
	int n = 0;
	double sum = 0;
	int i=0;
	//while 구문 시작값
	while ((i = rd.nextInt())!=0) {
		//값이 저렇게 될때까지 반복을 한다. 여기서는 0을 입력해야 종료되도록 되었음.
		sum += i;
		n++;
		//증가식
	}
	System.out.println("입력된 수의 개수는 "+n+"개이며 평균은" +sum/n+"입니다.");
	}
}
