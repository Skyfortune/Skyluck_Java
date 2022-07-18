package Project_java_chapter_3;

public class ForSample {
	public static void main(String[] args) {
		int i,j;
		
		for(j=0,i=1;i<=10; i++) {
			//j는 0 i는1에서 시작, i가 10이 될때까지, i는 1씩 증가.
			j += i;
			System.out.print(i);
			//j값이 1씩 증가되어서 나온다.
			if(i==10) {
				System.out.print("=");
				System.out.print(j);
				//i가 10이라면 '=' 과 'j'값을 출력
			}
			else
				System.out.print("+");
			//부등호 '+'를 출력
		}
		
	}
}
