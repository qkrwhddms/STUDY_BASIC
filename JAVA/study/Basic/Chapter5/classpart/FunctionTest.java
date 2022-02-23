package classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
		String sum = addNum(num1, num2);
		System.out.println(sum);
	}
	
	public static String addNum(int n1, int n2) {

		int result = n1 + n2;
		
		String str = Integer.toString(result);
		
		return str;
	}

}
