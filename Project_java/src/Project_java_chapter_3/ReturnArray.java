package Project_java_chapter_3;

public class ReturnArray {
	static int[] makeArray() {
		int temp[] = new int[8];
		for (int i=0; i<temp.length;i++)
			temp[i] = i;
		return temp;
		}
	//배열을 새로 생성한다. 8열의 배열을 생성
	public static void main (String[] args) {
		int intArray [];
		intArray = makeArray();
		//이때 위에 스테틱에 적었던 배열을 적어놓으면 그 배열을 불러 올 수 있다.
		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);
		//배열마다 숫자를 나열
	}
}
