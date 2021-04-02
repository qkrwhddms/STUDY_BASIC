package Study_chap01;

public class Study_023 {

	public static void main(String[] args) throws Exception {
		
		int KeyCode;   // 엔터까지 읽음. ENTER=[ CR=13, LF=10]
		
		KeyCode = System.in.read();
		System.out.println("KeyCode : " + KeyCode);
		
		KeyCode = System.in.read();
		System.out.println("KeyCode : " + KeyCode);  
		
		KeyCode = System.in.read();
		System.out.println("KeyCode : " + KeyCode);

	}

}
