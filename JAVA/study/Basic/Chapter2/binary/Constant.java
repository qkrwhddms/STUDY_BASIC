package binary;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final float PI = 3.14f;		// long 이나 float 값으로 저장해야 하는 경우 식별자(L,F)를 명시
		
		
		final int STUDENT_NUM = 31;
		
		int num = 0;
		if (num == STUDENT_NUM) {}
		
		System.out.println(STUDENT_NUM);
	}

}
