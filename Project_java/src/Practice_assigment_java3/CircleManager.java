package Practice_assigment_java3;

import java.util.Scanner;

	public class CircleManager {

		   public static void main(String[] args) {
		      // 매니져가 메인이 될거라고 늦게 알아차렸다.
		      Scanner sc = new Scanner(System.in);
		      //입력 받자
		      Circle c[] = new Circle[3]; 
		      // 3개의 Circle 배열 선언
		      for(int i=0; i < c.length; i ++) {
		         System.out.print("x, y, radius >>");
		         double x = sc.nextDouble(); // x값 입력 받기
		         double y = sc.nextDouble(); // y값 입력 받기
		         int radius = sc.nextInt(); // radius값 입력 받기
		         c[i] = new Circle(x, y, radius); // Circle 객체 생성
		      }
		      for(int i=0; i<c.length; i++) 
		         c[i].show();
		      sc.close();
		   }

		}