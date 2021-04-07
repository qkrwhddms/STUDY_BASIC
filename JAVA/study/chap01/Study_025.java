package Study_chap01;

public class Study_025 {

public static void main(String[] args) throws Exception {
		
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode : " + KeyCode);
			if(KeyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
