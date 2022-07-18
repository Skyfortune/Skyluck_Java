package Practice_assigment_java3;

public class EX03 {
	public static void main(String [] args) {
		String a = "Dancing Queen";
		String b = "ABBA";
		int c = 1987;
		String d = "스웨덴";
		
		
//		song song1 = new song ("Dancing queen", "ABBA", 1978, "스웨덴");
		song song1 = new song (a,b,c,d);
		
		new song("pain killer","주다스프리스트", 1990, "미국").show1();
		
		
		
		song1.show1(); 
	}
}
