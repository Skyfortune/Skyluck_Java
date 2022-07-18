package Practice_assigment_java;

import java.util.Scanner;

public class Ex_12_caculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int q1=sc.nextInt(); 
		String s=sc.next(); 
		int q2=sc.nextInt();  
		
		if(s.equals("+")) 
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1+q2));
		else if(s.equals("-")) 
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1-q2));
		else if(s.equals("*")) 
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1*q2));
		else if(s.equals("/")) 
			System.out.println(q1+s+q2+"의 계산결과는 "+(q1/q2));
		
		
		else
			System.out.println("+,-,*,/ 연산자만 사용해 주세요");
	}
}
