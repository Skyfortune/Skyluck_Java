package EX_09;

public class ArrayUtil {
	
	
	//concat은 배열(1,2)를 합쳐서 다 나열해야한다.
	public static int[] concat(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		//새로운 배열 c 생성, 배열의 숫자는 a,b의 숫자를 합침
		//이러면 배열은 [9]
		int i = 0;
		//4개짜리 복사
		for (i=0; i < a.length; i++) {
			c[i] = a[i];
		}
		//5개짜리 복사
		for (i=a.length; i < a.length + b.length; i++) {
			c[i] = b[i - a.length];
		}

		return c;
		//9개 짜리 배열 반환
	}

	public static void print(int[] a) { // 배열 a 출력
		System.out.print("[");
		int i = 0;
		for(i=0;i<a.length;i++) {
			System.out.print(" " +a[i]+" ");
		}
		System.out.print("]");

	}
}
