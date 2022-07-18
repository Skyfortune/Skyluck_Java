package Practice_assigment_java;
import java.util.Scanner;
public class Ex_5_triangle {
public static void main(String[] args) {
Scanner sr = new Scanner(System.in);

	System.out.print("정수 3개를 입력하시오>>");
	
	int a=sr.nextInt();
	int b=sr.nextInt();
	int c=sr.nextInt();
	
	if(a+b>c&&a+c>b&&b+c>a)
		System.out.print("삼각형이 됩니다.");
	else
		System.out.println("삼각형이 될 수 없습니다.");
	
	
}
}
