package EX_10;

public class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2eng(String eword) {
		// 내용작성
		// 이 kor[i]가 들어가면 eng[i]의 String이나오고 이것은 eword로 만들어서 리턴

		for(int i=0; i<kor.length;++i)
		{
			if(eword.equals(kor[i]))
				return eng[i];
		}
		return null;
	}

	public static String eng2kor(String kword) {
		// 내용작성
		// 이 eng[i]가 들어가면 kor[i]의 String이 나오고 이것은 kword로 만들어서 리턴
		for(int i=0; i<eng.length;i++)
		{
			if(kword.equals(eng[i]))
				return kor[i];
		}
		return null;
	}
	
	private void finish() {
		System.out.println("안녕!");
	}
}
