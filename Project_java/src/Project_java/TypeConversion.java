package Project_java;

public class TypeConversion {
	public static void main(String[] args) {
		byte b =127;
		int i =100;
		System.out.println(b+i);
		//127+100
		System.out.println(10/4);
		//2.5이지만, 소수점을 안넣은 정소라서 소수점 버림
		System.out.println(10.0/4);
		//소수점 넣은 실수이니까 소수점 포함함.
		System.out.println((char)0x12340041);
		//char는 문자이므로, 해당 아스키코드에 해당하는 A가 출력
		System.out.println((byte)(b+i));
		//1바이트는 -128~127 이므로 한바퀴 돌아서 -29
		System.out.println((int)2.9+1.8);
		//int는 정수이므로 마찬가지로 소수점 버림
		System.out.println((int)(2.9+1.8));
		//연산은 뒤쪽이 먼저이므로,
		System.out.println((int)2.9+(int)1.8);
		//
	}
}
