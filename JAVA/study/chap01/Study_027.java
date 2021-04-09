package Study_chap01;

public class Study_027 {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		int result3 = -b;   // byte(type)가 아닌 int(type)로 변환 해야한다.
		System.out.println("result3 = " + result3);
	}

}
