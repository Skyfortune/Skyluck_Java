package C4_3;

public class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	//프라이빗 수를 생성한다, 이름은 String으로 그냥 받는다 
	Goods(String n,int p, int nStack, int s){
		name = n;
		price = p;
		numberOfStock = nStack;
		sold = s;
		//이름,가격,재고,판매량 등등 각각 입력을 받게 한다.
	}
	
	String getName() {return name;}
	int getPrice() {return price;}
	int getnumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
	
	//리턴값을 설정함, Goods String 에서 받아오고 int 값으로 리턴되었다.
}
