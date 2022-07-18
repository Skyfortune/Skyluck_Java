package Project_java_chapter_4;

public class EX01 {
	
	public static void main(String[] arg) {
		Goods camera = new Goods();
		
		camera.name = "nikon";
		camera.price = 40000;
		camera.numberOfstock = 30;
		camera.sold = 50;
		
		System.out.println("상품 이름" + camera.name);
		System.out.println("상품 가격" + camera.price);
		System.out.println("재고 수량" + camera.numberOfstock);
		System.out.println("팔린 수량" + camera.sold);
	}
}
