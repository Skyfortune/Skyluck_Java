package Practice_assigment_java2;

import java.util.Scanner;

public class Rock_paper_sicers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		String UserSelect, ComSelect;
		int n; // 컴퓨터가 내는 것
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		do {
			System.out.print("가위 바위 보! >> ");
			UserSelect = sc.next();
			if (UserSelect.equals("그만"))
				break;
			n = (int) (Math.random() * 3);
			ComSelect = str[n];
			if (UserSelect.equals("가위")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 비겼습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 사용자가 졌습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 사용자가 이겼습니다.");
					continue;
				}
			} else if (UserSelect.equals("바위")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 사용자가 이겼습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 비겼습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 사용자가 졌습니다.");
					continue;
				}
			} else if (UserSelect.equals("보")) {
				if (str[n].equals("가위")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 사용자가 졌습니다.");
					continue;
				} else if (str[n].equals("바위")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 사용자가 이겼습니다.");
					continue;
				} else if (str[n].equals("보")) {
					System.out.println("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " 비겼습니다.");
					continue;
				}
			} else {
				System.out.println("다시하세요");
				continue;
			}
			System.out.print("사용자 = " + UserSelect + " , 컴퓨터 = " + ComSelect + " ");
		} while (true);
		System.out.println("게임을 종료합니다...");
		sc.close();
	}

}
//if문으로 비교를 하면서 나오도록 하면 됩니다. 
//내가 한것 출력시키고, 컴퓨터가 랜덤으로 뽑고, 그것을 비교해서 결과를 출력.
//
