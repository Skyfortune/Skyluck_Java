package C4_6;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("Good");
		String b = new String("bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;
		
		System.out.print(a +" "+ b +" "+ c +" "+ d );
		System.gc();
		//이때 가비지는 a로 입력했던 "Good"
		//
	}

}
