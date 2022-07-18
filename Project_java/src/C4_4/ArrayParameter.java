package C4_4;

public class ArrayParameter 
{	
	//메서드 1
	static void replaceSpace(char a[]) 
	{
		for(int i=0; i<a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';
	}
	 
	//메서드 2
	static void printCharArray(char a[]) 
	{
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
	
}


//char를 받아서 하나씩 더한다. 
