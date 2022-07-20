package EX_10;

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) { /* 검색 코드 작성 */
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				if (i % 2 == 0)
					System.out.print(word + "은 ");
				else
					System.out.print(word + "는 ");
				return eng[i];
			}
		}
		return "false";
	}
}
