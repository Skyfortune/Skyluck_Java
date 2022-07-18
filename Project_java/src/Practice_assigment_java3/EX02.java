package Practice_assigment_java3;

import java.util.Scanner;

public class EX02 {
public static void main(String [] args)
{
	Scanner in = new Scanner(System.in);
	System.out.print("수학, 과학, 영어 순으로 3개의 점수입력 >>");
	int math = in.nextInt();
	int science = in.nextInt();
	int english = in.nextInt();
	grade me = new grade(math, science, english);
	System.out.println("평균은" + me.average());
	//me를 새로 만들어야하나 했는데, 바로 위에 있었다
	
	in.close();
}
}
