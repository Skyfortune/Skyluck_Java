package Project_java_chapter_3;

public class SalesRevenue {
	public static void main (String[] args) {
		int intArray[][]= {{90,90,110,110},
						  {120,110,100,110},
						  {120,140,130,150}};
		//이러면 new int[3][4]와 같은걸까, 각 값은 이미 넣어져있다.
		double sum = 0;
		
		for (int i = 0; i<intArray.length; i++) //intAttay.length=3
			//
			for (int j = 0;j <intArray[i].length;j++)//intArray[i].length=4
				sum += intArray[i][j];
		
		System.out.println("지난 3년간 매출 총액은" + sum + "이며 연평균 매출은" +sum/intArray.length + "입니다.");
		}
	}
