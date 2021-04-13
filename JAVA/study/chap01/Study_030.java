package Study_chap01;

public class Study_030 {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;   // result1에 7이 저장
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;   // result2에 3이 저장
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;   // result3에 10이 저장
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;   // 5/2 = 2.5 정수/정수 이므로 2가 저장
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;   // 5/2 이므로 1이 저장 (몫이 아닌 나머지 값)
		System.out.println("result5 = " + result5);
		
		double result6 = (double) v1 / v2;   // 실수,정수 산술연산이 됨으로 double/double이 되기때문에 2.5가 저장
		System.out.println("result6 = " + result6);

	}

}
