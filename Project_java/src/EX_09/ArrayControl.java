package EX_09;

public class ArrayControl {
	public static void main(String[] arg) {
		
	int [] array1 = {1, 5, 7, 9};
	int [] array2 = {3, 6, -1, 100, 77};
	int [] array3 = ArrayUtil.concat(array1, array2);
	//concat은 (배열1,배열2)를 합쳐서 새로운 배열을 만든다
	//그러면 concat은 배열1,2를 합쳐야겠지
	ArrayUtil.print(array3);
	}
}
