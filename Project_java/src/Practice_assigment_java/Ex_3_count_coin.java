package Practice_assigment_java;
import java.util.Scanner;
public class Ex_3_count_coin {
public static void main(String[] args) {
	Scanner A = new Scanner(System.in);
	System.out.print("금액을 입력하시오>>");
	int won = A.nextInt(); // 입력한 A를 won이라는 이름의 정수타입으로 리턴한다.
	int fifty =	(won/50000); 	//5만원권 갯수
	int left_1=	(won%50000);           	//5만원 뺀 돈
	
	int ten_t=	(left_1/10000); 	//1만원권 갯수
	int left_2=	(left_1%10000);         //1만원 뺀 돈
	
	int F_T=	(left_2/5000);   //5천원권 갯수
	int left_3=	(left_2%5000);         //5천원 뺀 돈
	
	int O_T=	(left_3/1000);	//천원
	int left_4=	(left_3%1000);
	
	int F_H=	(left_4/500);	//오백원
	int left_5=	(left_4%500);
	
	int O_H=	(left_5/100);	//백원
	int left_6=	(left_5%100);
	
	int FT=		(left_6/50);		//50원
	int left_7=	(left_6%50);
	
	int OT=		(left_7/10);		//10원
	int left_8=	(left_7%10);
	
	System.out.println("5만원권"+(int)fifty+"매");
	System.out.println("만원권"+(int)ten_t+"매");
	System.out.println("오천원권"+(int)F_T+"매");
	System.out.println("천원권"+(int)O_T+"매");
	System.out.println("오백원"+(int)F_H+"개");
	System.out.println("백원"+(int)O_H+"개");
	System.out.println("오십원"+(int)FT+"개");
	System.out.println("십원"+(int)OT+"개");
}
}
//좀 무식한 방법 같다. 