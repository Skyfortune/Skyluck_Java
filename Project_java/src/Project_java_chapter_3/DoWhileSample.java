package Project_java_chapter_3;

public class DoWhileSample {
	public static void main (String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a);
			a=(char)(a+1);
		} while(a <= 'z');
	}
}
