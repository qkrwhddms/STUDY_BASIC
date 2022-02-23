package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}						// 디폴트 생성자
	
	public Student(int id, String name) {	// 매개변수로 입력받는 생성자
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	

	
}
