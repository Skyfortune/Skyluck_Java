package Project_java_chapter_4;

public class EX02 {
public static void main(String[] args) {
	MyExp number1 = new MyExp();
	number1.base = 2;
	number1.exp = 3;
	
	MyExp number2 = new MyExp();
	number2.base = 3;
	number2.exp = 4;
	
	System.out.println("2의3승 =" + number1.getValue());
	System.out.println("3의4승 =" + number2.getValue());
	
}
}
