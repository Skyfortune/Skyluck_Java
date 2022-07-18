package Project_java;

import java.util.Scanner;

public class Grading {
	public static void main (String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()) {
			int score = a.nextInt();
			if(score >= 90) // score 가 90 이상인 경우
				grade = 'A';
			else if(score>=80) // score 가 80이상이면서 90미만인 경우
				grade = 'B';
			else if(score>=70) // score 가 70이상이면서 80미만인 경우
				grade = 'C';
			else if(score>=60 ) // score 가 60이상이면서 70미만인 경우
				grade = 'D';
			else // score 가 60 미만인 경우
				grade = 'F';
			System.out.println("학점은 "+grade+"입니다");
		}
	}
}
