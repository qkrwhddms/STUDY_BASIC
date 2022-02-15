package ifexample;

public class IfExample3 {

	public static void main(String[] args) {

		/* if문은 else를 사용해야한다.
		 * else를 사용하지 않으면 조건에서 빠져나가지 못한다.
		 */
		
		int age = 9;
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("성인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}

}
