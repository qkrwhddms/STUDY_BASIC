package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] agrs) {
	
		Company c1 = Company.getInstace();
		
		Company c2 = Company.getInstace();
		
		System.out.println(c1);
		System.out.println(c2);
		
		Calendar cal = Calendar.getInstance();
		
		
	}
}
