package Study_chap01;

import java.util.Scanner;

public class Study_026 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}

		System.out.println("종료");
		
	}

}
