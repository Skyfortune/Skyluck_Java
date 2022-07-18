package C4_4;

public class Basic 
{
	public static void main (String args[]) 
	{
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		//객체를 만들어보자
		
		//ArrayParameter ap1 = new ArrayParameter();
		//받아서 쓸 수 있게 만들었다.
		
		ArrayParameter.printCharArray(c);
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
		
		//ap1 만드는거 대신 이렇게 클래스 이름을 넣어도 가능
	}
}
