package ex05_3;

public class Won2Dollar extends Converter{
//추상메소드이니까 오버라이딩으로 구현해야한다.
	@Override
	protected double convert(double src) {
		System.out.print("원");
	}
	@Override
	protected String srcString() {
		return ;
	}
	@Override
	protected String destString() {
		System.out.print("달러");
	}
	protected double ratio {
		return;
	}
	
	

}
