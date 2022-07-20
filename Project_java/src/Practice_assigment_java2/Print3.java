package Practice_assigment_java2;
import java.util.Scanner;
public class Print3 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수10개를 입력하시오>>");
		int intArray[] = new int[10];
		for(int i=0; i<intArray.length;i++) {
			intArray[i] = in.nextInt();
		}
		//수열 생성 x축 10개
		System.out.print("3의 배수는");
		for (int i=0;i<intArray.length; i++ ) {
			if((intArray[i]%3)==0) {
				System.out.print(intArray[i]+" ");
			
			}
		}
		
		//가능하면 또 수열을 생성해서 그 수열을 출력하고 싶다.
		
	}
}
