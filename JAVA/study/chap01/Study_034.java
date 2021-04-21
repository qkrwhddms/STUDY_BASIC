package Study_chap01;

public class Study_034 {

	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println((double)v5); // 부동소수점방식타입 이기에 같지않다..
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4 * 10) == (int)(v5 * 10));   
		/*
		 *  실수는 double로 통일하거나,
		 *  float으로 통일하거나,
		 *   int타입으로 정수화 
		 *   시켜서 비교를 하는것이 좋다.
		 */
		
	}

}
