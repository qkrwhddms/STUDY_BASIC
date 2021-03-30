package Study_chap01;

public class Study_022 {

	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);   // 6자리 앞자리는 공백
		System.out.printf("상품의 가격 : %-6d원\n", value);   // 6자리 왼쪽으로정렬
		System.out.printf("상품의 가격 : %06d원\n", value);   // 비어있는자리 0
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);   // 소수이하자리 두자리출력
		
		String name = "박종은";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
