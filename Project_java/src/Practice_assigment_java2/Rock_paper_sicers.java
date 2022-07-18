package Practice_assigment_java2;
import java.util.Scanner;
public class Rock_paper_sicers {
	public static void main (String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		int a=0;
		String me = "";
		String com = "";
		//만약 int a[]; 이런건 []안에 블록수 만큼 값의 선택지를 가져감 null 이라는 경고가 뜬다면
		//그 안의 범위에 들어가지 않은 것
		
		//반복
		while(true)
		{
				//1.내가 내는거 
				System.out.print("가위 바위 보!!>>");
				Scanner sc = new Scanner(System.in);
				//me = sc.nextline()
			
				if(me.equals("그만"))
				//문자로 받기위해서 이런 수식을 사용한다.
				break;
				
				//컴이 내는거
				//랜덤 - > 정수 -> 스트링에 매칭
				//int com1 = (int)(Math.random()*3
						
				//switch(com1)
				{
				//case 0;
				com = "가위";
				break;
				//case 1;
			//	com = "바위";
		//		break;
				//case 2;
			//	com = "보";
		//		break;
				}
				
				//둘이 낸거 출력
				
			//	System.out.println("사용자=" + me + "컴퓨터"+ com1);
				//3.나와 컴퓨터 비교
				//내가 내는것과 매칭이 되는지 각자 만들면 된다. 
			//	if(me.equals("가위"))  //나
			//	{
					
				
			//	else if(me.equals("바위"))
		//		{
					
				}	
					
			//	else if(me.equals("보"))
				{
					
				}	
					
			//	else
				System.out.println("가위 바위 보에서 내주세요");
				{
					
				}
				}
	//	}
				
	//	}
		
		
		
		String str[] = {"가위","바위","보"};
		
        int n = (int)(Math.random()*3);
		
	}
//if문으로 비교를 하면서 나오도록 하면 됩니다. 
//내가 한것 출력시키고, 컴퓨터가 랜덤으로 뽑고, 그것을 비교해서 결과를 출력.
//

