package Practice_assigment_java3;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {

		      Scanner sc = new Scanner(System.in);
		      Circle2 c[] = new Circle2[3]; 
		      int max = 0;
		      for(int i=0; i < c.length; i ++) {
		         System.out.print("x, y, radius >>");
		         double x = sc.nextDouble(); // x값 입력 받기
		         double y = sc.nextDouble(); // y값 입력 받기
		         int radius = sc.nextInt(); // radius값 입력 받기
		         c[i] = new Circle2(x, y, radius); // Circle 객체 생성
		      }
		      for(int i=0;i<c.length;i++)
		    	  if(max<c[i].getRadius())
		    		  max=c[i].getRadius();
		      for(int i=0; i<c.length;i++)
		    	  if(max == c[i].getRadius()) {
		    		  System.out.print("가장 면적이 큰 원은");
		    		    c[i].show();
		    	  }
		  
		      sc.close();
		   
	}

}
