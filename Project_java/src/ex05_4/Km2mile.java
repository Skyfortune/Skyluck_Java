package ex05_4;

import java.util.Scanner;

class Km2Mile extends Converter {
	private double ratio;

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}



	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}

}
