package EX_10;

import java.util.Scanner;

public class DicApp {
	private Scanner sc;

	private void eng2kor() {
	}

	private void kor2eng() {

	}

	private void finish() {

	}

	private void run() {
		System.out.print("한영 단어 검색 프로그램입니다.");
		// 맨 처음 나오도록 설정을 한다.
		while (true) {
			System.out.println();
			System.out.print("어떤 검색을 하시겠습니까(한/영:1, 영/한:2, 끝내기:3) >>");
			int select = sc.nextInt();
			switch (select) {
			
			case 1:// 한/영
				kor2eng();
				break;
				
			case 2:// 영/한
				eng2kor();
				break;
				
			case 3:// 끝내기
				finish();
				return;
				
			default:
				System.out.println("1~3 사이의 수를 입력해 주세요!");
			}
			// 1이라면 한영사전, 2라면 영한사전, 3이라면 종료. 나머지는 재입력 출력
		}
	}

}