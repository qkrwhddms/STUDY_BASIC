package hiding;

class BirthDay {

	public int day;			// 접근제어자 public은 외부클래스에서 가져다 쓸 수 있음.
	private int month;		// 접근제어자 private은 내 클래스 안에서만 사용가능.
	int year;		// 접근제어자 default는 표시를 하지 않으면 default이고, 같은 패키지 내에서는 쓸 수 있음.
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(month == 2) {
			if( day < 1 || day > 28) {
				System.out.println("날짜 오류 입니다.");
			}
		}
		else {
			this.day = day;			
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

public class BirthDayTest{
	
	public static void main(String[] agrs) {
		
		BirthDay day = new BirthDay();
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2018);
	}
}