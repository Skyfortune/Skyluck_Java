package Practice_assigment_java;
import java.util.Scanner;
public class EX_3_count_money {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
        int money = sr.nextInt();
        int m0=(money/50000);//오만원권
        int m1=(money%50000)/10000;//만원권
        int m2=(money%10000)/5000;//오천원권
        int m3=(money%5000)/1000;//천원권
        int m4=(money%1000)/500;//오백원권
        int m5=(money%500)/100;//백원권
        int m6=(money%100)/50;//오십원권
        int m7=(money%50)/10;//십원권
        
        System.out.println("오만원권 	"+m0+"매");
        System.out.println("만원권 	"+m1+"매");
        System.out.println("오천원권 	"+m2+"매");
        System.out.println("천원권 	"+m3+"매");
        System.out.println("오백원권 "+m4+ "개");
        System.out.println("백원권 	"+m5 +"개");
        System.out.println("오십원권 	"+m6+ "개");
        System.out.println("십원권 	"+m7+ "개");
    }    
}
