package C4_3;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Goods[] GoodsArray;
		GoodsArray = new Goods[3];
		//Goods 클래스 에서 배열을 받아온다
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<GoodsArray.length;i++) {
			String name = s.next();
			//처음에 이름을 받도록하고
			int price = s.nextInt();
			//두번째는 가격을
			int n = s.nextInt();
			//세번째는 재고수를
			int sold = s.nextInt();
			//네번째는 판매량
			GoodsArray[i] = new Goods(name,price, n , sold);
		}
		for(int i=0; i<GoodsArray.length; i++) {
			System.out.print(GoodsArray[i].getName()+" ");
			System.out.print(GoodsArray[i].getPrice()+" ");
			
			System.out.print(GoodsArray[i].getnumberOfStock()+" ");
				System.out.println(GoodsArray[i].getSold());
		}
		
	}
}
