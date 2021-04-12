package Study_chap01;

public class Study_028 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------------");
		x++;   // x = 1증가로 11
		++x;   // x = 1증가로 12
		System.out.println("x=" + x);   // x = 12 출력
		
		System.out.println("----------------------------");
		y--;   // y = 1감소로 9
		--y;   // y = 1감소로 8
		System.out.println("y=" + y);   // y = 8출력
		
		System.out.println("----------------------------");
		z = x++;   // z=12, x=1 증가로 13
		System.out.println("z=" + z);   // z = 12
		System.out.println("x=" + x);   // x = 13
		
		System.out.println("----------------------------");
		z = ++x;   // x값이 1증가(14) 시킨 후 z에 14를 대입
		System.out.println("z=" + z);   // z = 14
		System.out.println("x=" + x);   // x = 14
		
		System.out.println("----------------------------");
		z = ++x + y++;   // x의 값에 1증가(15) y는8 합 23을 z에 대입 후 y는 1증가로 9
		System.out.println("z=" + z);   // 23
		System.out.println("x=" + x);   // 15
		System.out.println("y=" + y);   // 9
		/*
		 가독성은 이것이 좋음.
		 ++x;
		 z = x + y;
		 y++;
		 가독성은 이것이 좋음.
		 */
	}

}
