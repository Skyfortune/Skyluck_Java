package Project_java_chapter_3;

public class foreachEx {
	enum week {월, 화, 수, 목, 금, 토, 일 }
		//월-일 수열 입력
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		//수열 num은 1,2,3,4,5 입력
		String names[] = {"사과", "배", "바나나", "체리" , "딸기", "포도"};
		//수열이름 나열
		int sum = 0;
		//초기값 설정
		//아래 for-each에서 k는 num[0],num[1] ...num[4]로 반복됨
		for(int k:num)
			sum += k;
		//num 수열이 모두 나열, 그리고 모두 합치는 수식을 반복
		System.out.println("합은" + sum);
		
		//아래 for-each에서 s는 names[0], names[1],...,names[5]로 반복됨
		for (String s: names)
			System.out.println(s + "");
		//names의 수열을 모두 반복, ln으로 끝났으니 계속 아래로 내려감
		System.out.println();
		
		//아래 for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복됨
		for (week day : week.values())
			System.out.print(day+"요일");
		System.out.println();
	}
}
