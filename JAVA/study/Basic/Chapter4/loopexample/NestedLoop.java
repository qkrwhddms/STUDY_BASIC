package loopexample;

import java.util.Iterator;

public class NestedLoop {

	public static void main(String[] args) {

		/******************** 중첩 for문 ********************/
	/*	int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {
			
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + " X " + times + " = " + dan*times);
			}
			System.out.println();
		}
	*/	
		
		
		/******************** 중첩 while문 ********************/
	/*	int dan = 2;
		int times = 1;
		
		while (dan <= 9) {
			times = 1;
			while(times <= 9) {
				System.out.println(dan + " X " + times + " = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
	*/	
		
	/*	int dan = 2;
		int times = 1;
		
		while (dan <= 9) {
			if ( (dan % 2) != 0 ) {
				dan++;		// 빠지면 안됨. continue가 있기에.
				continue;
			}	
			times = 1;
			while(times <= 9) {
				System.out.println(dan + " X " + times + " = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
	*/	
		
		/******************** 구구단을 단보다 곱하는 수가 작거나 같은경우 출력 ********************/
		int dan = 2;
		int times = 1;
		
		while (dan <= 9) {
				
			times = 1;
			while(times <= 9) {
				if(times > dan) 
					break;
				System.out.println(dan + " X " + times + " = " + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
		
	}

}
