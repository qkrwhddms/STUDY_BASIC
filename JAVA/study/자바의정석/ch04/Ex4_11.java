import java.util.*;

class Ex4_11 {
	public static void main(String[] args) { 

		// i=1,2,3,4,5   5번 {} 안의 내용을 반복
		for(int i=1; i<=5; i++) {
			// System.out.println("**********");
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();  // 줄바꿈
		}
		
		// i=세로
		// j=가로
		
		// i | j
		// ㅡ ㅡ ㅡ 
		// 1 | 1
		// 2 | 2
		// 3 | 3
		// 4 | 4
		// 5 | 5

		
	} // main의 끝
}