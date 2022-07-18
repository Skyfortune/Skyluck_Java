package EX_08;

import java.util.Scanner;

import EX_07.Day;

public class phonebook {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Phone phone[];
		// phone 수열 생성

		int i; 
		System.out.print("인원수>>");
		int num = sc.nextInt();
		// 입력된 값만큼 수열 생성

		phone = new Phone[num];
		for (i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호는 빈 칸없이 입력");
			String name = sc.next();
			String tel = sc.next();
			// 이름과 번호를 각각 입력받고

			phone[i] = new Phone(name, tel);
			// 이름,전화번호를 나열하는 수열을 i수 만큼 생성.

		}
		System.out.println("저장되엇습니다.");

		
		//입력받기 생성 
		while (true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			// 이름 입력 받자

			for (i = 0; i < num; i++) {
				// num은 위에서 입력받은 수열의 갯수
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "의 번호는" + phone[i].getTel() + "입니다.");
					i--;
					break;
				}
			}
			if (name.equals("그만")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			if (i == num)
				System.out.println(name + "이 없습니다.");
		}
	}

}