package Practice_assigment_java;

import java.util.Scanner;

public class Ex_11_season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month=sc.nextInt(); 
		if(month<1||month>12)
			System.out.println("1~12의 숫자를 입력하세요");
		else if(month>=3&&month<=5)
			System.out.println("봄");
		else if(month>=6&&month<=8)
			System.out.println("여름");
		else if(month>=9&&month<=11)
			System.out.println("가을");
		else 
			System.out.println("겨울");
		
			
			
			
	}
}
