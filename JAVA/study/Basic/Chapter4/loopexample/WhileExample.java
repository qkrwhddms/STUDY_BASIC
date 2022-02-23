package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		/************** while문은 시작할 때 조건이 맞지 않으면 실행하지 않음. **************/
		
	/*	int num = 1;
		int sum = 0;
		
		while( num <= 10 ) {
			
			sum += num;		// sum = sum + num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	*/	
		
		
		/************** do while문은 반드시 한번 실행 함. **************/
		
		int num = 1;
		int sum = 0;
		
		do {
			
			sum += num;		// sum = sum + num;
			num++;
		} while(num <=  10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
		
		
	}

}
