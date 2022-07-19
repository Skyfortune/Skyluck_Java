package Project_java_chapter_5_7;
//추상클래스로 add(int a, int b) subtract(int a, int b) average(int[] a) 생성

public class GoodCalc extends Calculator {
	// 자식클래스, Calculator클래스를 부모로 선언
	@Override
	public int add(int a, int b) {// 추상 메소드 구현
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {// 추상 메소드 구현
		return a - b;
	}

	@Override
	public double average(int[] a) {// 추상 메소드 구현
		double sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum / a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 2, 3, 4 }));
	}

}
