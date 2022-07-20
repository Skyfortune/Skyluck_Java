package ex05_3;

class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	// 우선 ratio 비율값을 선언한다.
	protected double convert(double src) {
		return src / ratio;
	}

	// 그리고 변환값은 원/비율 이니까 이렇게 리턴시킨다.


	protected String getsrcString() {
		return "원";
	}

	protected String getdestString() {
		return "달러";
	}

	protected String srcString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String destString() {
		// TODO Auto-generated method stub
		return null;
	}

}
