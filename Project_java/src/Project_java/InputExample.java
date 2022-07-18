package Project_java;

import java.io.*;
public class InputExample {
	public static void main (String args[]) {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				//while 구문은 무한대로 반복.

				int a = rd.read();
				if(a == -1) // ctrl-z가 입력되면 read()는 -1을 리턴 (제어문자)
					break; //반복을 중지한다.
				System.out.println((char)a);//입력된 문자 출력
				//a라는 입력값을 출력한다.
			}
		}
		catch(IOException e) {
			System.out.println("입력 에러 발생");
		}
	}
}
