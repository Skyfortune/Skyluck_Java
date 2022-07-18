package Project_java;
import java.util.Scanner;
public class ArithmeticOperator {
	public static void main (String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");//시,분,초로 변환될 정수 입력
		
		time = sc.nextInt();
		second = time%60; // 60으로 나눈 나머지는 초를 의미
		minute =(time/60)%60; //60으로 나눈 몫을 다시 60으로 나눈 나머지는 분을 의미
		hour =(time/60)/60; //60으로 나눈 몫을 다시 60으로 나눈 몫은 시간을 의미
		
		System.out.println(time+"초는");
		System.out.println(hour+"시간");
		System.out.println(minute+"분");
		System.out.println(second+"초입니다.");
	}
}
//int기반이기 때문에 최대 2147483647 까지 들어간다.
//그 이후는 깨져버린다.