package Practice_assigment_java2;
import java.util.Scanner;
public class Star_maker {
	public static void main (String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int a = sr.nextInt();
		//a를 입력한 정수로 생성
		// i가 a보다 작아질때까지 줄을 생성
		for (int i=0 ; i<a ; i++) {
			//초기 i는 0이 되고 i는 1씩 증가,
			//5를 입력했다면 5,0 5,1 5,2 5,3 5,4 5,5 5,6
				//j는 별의 갯수
			for (int j=a; j>i; j--) {
				System.out.print("*");
				}
			
				System.out.println("");
		}
			
		}
	}

//적은 숫자만큼 열을 생성하고, 위에서부터 아래로 별을 그릴겁니다.
//5를 적었으면 첫번째는 *다섯개 다음줄은 *4개 그런식으로 만 아래는 한개.
//입력값이 5라면 처음에는 별을 다섯개 만드는 루프를 만들어야겠다.
//5카운트 떨어질때까지 *을 만드는 if문을 만든뒤에, 카운트0이되면 공백을 포함한 다음줄 출력을 사용.
//그 다음은 입력값에 -1을 하는 배열을 만들고나서 반복을 시킴
