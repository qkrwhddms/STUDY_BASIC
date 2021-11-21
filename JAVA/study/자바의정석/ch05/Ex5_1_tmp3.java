import java.util.Arrays; // ctrl+shift+o 자동으로 import문 추가

class Ex5_1_tmp3 {
	public static void main(String[] args) {
		int[] arr = {3,4,1,0,2}; // 1차원 배열 arr
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); // 배열 arr을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2D = {{11,12},{21,22}}; // 2차원 배열
		
		System.out.println(Arrays.toString(arr)); // toString(1차원)
		System.out.println(Arrays.deepToString(arr2D)); // deepToString(2차원, 다차원)
		
		String[][] str2D = {{"ccc","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // 참조변수 값 비교
															// equals(1차원), deepEquals(2차원,다차원)
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); // copyOf(1차원), length(배열의길이만큼)
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4); // copyOfRange(2차원, 다차원), 2~4 to는 생략(4생략)
		System.out.println(Arrays.toString(arr3));

		
	}
}