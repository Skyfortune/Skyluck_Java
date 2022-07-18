package Project_java_chapter_3;

public class IrregularArray {
	public static void main (String[] args) {
		int intArray[][] = new int [4][]; //세로 4열짜리인데 가로 몇개까지 늘릴지는 안정함,
		intArray[0] = new int[3];   	  //0번째 열에는 3개 지정
		intArray[1] = new int[2]; 		  //1번째 열에는 2개 지정
		intArray[2] = new int[3];		  //2번째 열에는 3개 지정
		intArray[3] = new int[2];		  //3번째 열에는 2개 지정
		//공간은 지정했지만 내용물은 비어있다
		for (int i=0; i< intArray.length; i++)
			for (int j = 0; j<intArray[i].length; j++)
				intArray[i][j] = (i+1)*10 + j;
				//i행 j열을 배열한다, 첫번째 열 첫번째 자리에는 0,0이 들어가니까
				//0,0 = 10+0, 그래서 첫번째 열에는 10,11,12가 채워진다.
				//그렇게 반복해서 수열을 다 채운뒤에, 아래에서는 그 수열을 나열한다. 
		for (int i=0; i< intArray.length; i++) {
			for (int j=0;j<intArray[i].length;j++)
				System.out.print(intArray[i][j]+" ");
			System.out.println();
			//
		}
	}
}
