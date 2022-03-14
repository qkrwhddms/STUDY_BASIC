package array;

public class ArrayTest {

	public static void main(String[] args) {

	/*	int[] numbers = new int[] {0, 1, 2};	// 배열 초기화 0,1,2
		
		System.out.println(numbers.length);		// length는 배열의 길이
	*/
			
		int[] numbers = new int[] {1,2,3};;
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
		double[] studentIDs = new double[5];

		for(int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
		
	}

}
