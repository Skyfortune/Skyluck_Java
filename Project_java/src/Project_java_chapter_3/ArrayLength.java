package Project_java_chapter_3;
import java.util.Scanner;
public class ArrayLength {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		//배열 선언, 5개.
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = in.nextInt();
		}
		//초기 i값은 0, 배열의 크기(5) 만큼 반복, 새로운 배열 생성.
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i]; }
		//배열의 숫자들을 모두 합칠때까지 반복해서 내용물들을 더함
			System.out.print("배열 원소의 평균은" +sum/intArray.length+ "입니다.");
			//그 합쳐진 sum을 배열의 숫자만큼 나누어서 평균을 만든다.
		}
			
	}

