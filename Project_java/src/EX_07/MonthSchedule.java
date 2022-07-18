package EX_07;

import java.util.Scanner;

public class MonthSchedule {
	private Scanner sc;
	private Day days[];

	// 입력값을 받고, days 수열 생성
	public MonthSchedule(int day) {
		this.days = new Day[day];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		// day라는 값을 입력한 만큼 수열을 생성한다.
		// 10이라고 적었다면 10개의 수열이 생기는것
		sc = new Scanner(System.in);
		// 입력받는칸이 이제 나온다.
	} 

	private void input() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		// 입력받는 값을 day로 받는다
		
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		// String 으로 work의 문자 내용을 받는다.
		day--;
		if (day < 0 || day > 30) { // 0~29
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		days[day].set(work);

	}

	private void view() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		day--;
		if (day < 0 || day > 30) { // 0~29
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		System.out.print((day + 1) + "일의 할 일은 ");
		days[day].show();
	}

	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		// 내용을 출력하고 입력을 닫는다.
	}

	public void run() {
		System.out.print("이번달 스케쥴 관리 프로그램.");
		// 맨 처음 나오도록 설정을 한다.
		while (true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int select = sc.nextInt();
			switch (select) {
			case 1://입력
				input();
				break;
			case 2://보기
				view();
				break;
			case 3://끝내기
				finish();
				return;
			default :
				System.out.println("1~3 사이의 수를 입력해 주세요!");
			// 1이라면 input항목으로, 2라면 view항목, 3이라면 리턴.
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();
	}

}
