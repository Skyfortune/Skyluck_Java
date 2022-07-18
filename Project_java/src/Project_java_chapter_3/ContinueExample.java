package Project_java_chapter_3;

public class ContinueExample {
	public static void main (String[] args) {
		int sum = 0;
		for (int i =1; i <= 100; i++) {
			//초기값 i=1 부터 시작 i++되어서 하나씩 증가, i<=100까지 진행
			if(i%2 == 1)
				continue;
			//의미가 없는 코드이긴한데..
			//도돌이표 같은 느낌
			else
				sum += i;
			//i값을 더해서 sum이 증가한다.
		}
		System.out.println("1부터 100까지 짝수의 합은" + sum);
	}
}
