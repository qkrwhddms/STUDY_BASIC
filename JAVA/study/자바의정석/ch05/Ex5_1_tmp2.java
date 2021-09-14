import java.util.Arrays; // ctrl+shift+o 자동으로 import문 추가

class Ex5_1_tmp2 {
	public static void main(String[] args) {
		//				01234
		String str = "ABCDE"; // str.length()는 5
		char ch = str.charAt(4); // E
		String str2 = str.substring(1,4); // 1~4 그런데 to는 들어가지 않는다.(생략)  BCD
		String str3 = str.substring(1); // 1~4
		String str4 = str.substring(1, str.length()); // 배열의 길이 만큼 (5 만큼) 
		System.out.println(str3); // BCD
		
	}
}