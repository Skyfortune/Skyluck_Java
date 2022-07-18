package Practice_assigment_java2;

import java.util.Scanner;

public class Word_maker {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		//입력창을 연다
		String s = sr.next();
		char c = s.charAt(0);
		//String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환한다.
		for (int i=0 ; i<c ; i++) {
		//초기값은 0으로 하고 하나씩 늘려나가자
			System.out.print(c);

	}
}
}