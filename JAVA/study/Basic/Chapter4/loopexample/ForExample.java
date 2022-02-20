package loopexample;

public class ForExample {

	public static void main(String[] args) {

		/********************  while문 ********************/
	/*	int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	*/
		
		/********************  for문 ********************/
		int num;
		int sum;
		
		for(num = 1, sum = 0; num <= 10; num++) {
			
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
		
		
		
		
	}

}
