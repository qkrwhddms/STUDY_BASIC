package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void PrintThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {

		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		
		System.out.println(b1);
		b1.PrintThis();
		
		System.out.println(b2);
		b2.PrintThis();
	}

}
