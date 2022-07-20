package ex05_1_2;

class ColorTV extends TV {
	private int resolution;
	//resolution 선언,
	   ColorTV(int size, int resolution) {
		   //main에서 컬러티비(a,b)로 적어져있으니 같게 만든다.
	      super(size);
	      //슈퍼클래스 호출, 생성자코드의 첫번째에 와야한다.
	      this.resolution = resolution;
	   }
	   public void printProperty() {
	      System.out.println(getSize()+"인치 "+resolution+"컬러");
	   }
	}
