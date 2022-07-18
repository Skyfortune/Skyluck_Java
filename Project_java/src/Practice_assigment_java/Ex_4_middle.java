package Practice_assigment_java;
import java.util.Scanner;
public class Ex_4_middle {
public static void main (String arg[]) {
		
	Scanner sr = new Scanner(System.in);
	
	int a;
	int b;
	int c;
	
	System.out.print("정수 3개 입력>>");
	
	a=sr.nextInt();
	b=sr.nextInt();
	c=sr.nextInt();
	
	if(a>b && a>c) 
		
	if(b>=c) 
			System.out.println(b);
		else if(b<c)
			System.out.println(c);	
		
	else if(b>a && b>c)
		if (a>=c)
			System.out.println(a);
		else if(a<c)
			System.out.println(c);
	
	if(c>a && c>b)
		if (a>=b)
			System.out.println(a);
		if(a<b)
			System.out.println(b);
		
	
			
		
		}
	
}

