package EX_10;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어?");
			String search = sc.next();
			if (search.equals("그만"))
				break;
			String eng = Dictionary.kor2Eng(search);
			if (eng.equals("false"))
				System.out.println(search + "는 저의 사전에 없습니다.");
			else
				System.out.println(eng);
		}
		sc.close();
	}

}