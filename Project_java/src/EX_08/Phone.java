package EX_08;
//따로 떼서 할려고했더니, 이름과 번호는 빈칸없이 입력이라 String으로 받아야할것 같다.
class Phone {
	private String man;
	private String tel;
	Phone(String man, String tel){
		this.man = man;
		this.tel = tel;
	}
	public String getName() {
		return man;
	}
	
	
	public String getTel() {
		return tel;
	}
	
}