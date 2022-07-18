package Practice_assigment_java;

import java.util.Scanner;

public class Ex_12_swith_caculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int q1=sc.nextInt(); 
		String s=sc.next(); 
		int q2=sc.nextInt();
		
		switch(s) {
		case "+":
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1+q2));
			break;
		case "-":
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1-q2));
			break;
		case "*":
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1*q2));
			break;
		case "/":
			
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1/q2));
			//0으로 나눌때 오류가 나는 것도 추가를 하자
			
			break;
		default:
			System.out.println("+,-,*,/ 연산자만 사용해 주세요");		
		
		}
		
	}
}
