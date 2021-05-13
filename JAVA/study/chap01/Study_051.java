package Study_chap01;

public class Study_051 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 100);
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);

	}

}
