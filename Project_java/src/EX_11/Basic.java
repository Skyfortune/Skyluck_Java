package EX_11;

import java.util.Scanner;

public class Basic {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오>>");

		int a = sc.nextInt();
		char op1 = sc.next().charAt(0);
		int b = sc.nextInt();
		

		switch (op1) {
		case '+':
			Add add1 = new Add();
			add1.setValue(a, b);
			int addresult = add1.Calculate();
			System.out.println(addresult);
			break;
		case '-':
			Sub sub1 = new Sub();
			sub1.setValue(a, b);
			int subresult = sub1.Calculate();
			System.out.println(subresult);
			break;

		case '*':
			Mul mul1 = new Mul();
			mul1.setValue(a, b);
			int mulresult = mul1.Calculate();
			System.out.println(mulresult);
			break;
		case '/':
			Div div1 = new Div();
			div1.setValue(a, b);
			int divresult = div1.Calculate();
			System.out.println(divresult);
			break;
		}

	}
}
