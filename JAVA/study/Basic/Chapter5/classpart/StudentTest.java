package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
			Student studentPark = new Student(100, "박종은");		// 기본생성자 생성
			studentPark.address = "서울시 양천구 신정동";
			
			Student studentLee = new Student();			// 기본생성자 생성
			studentLee.studentName = "이종은";
			studentLee.studentID = 101;
			studentLee.address = "미국 산호세";
			
			studentPark.showStudentInfor();			// 참조변수
			studentLee.showStudentInfor();			// 참조변수
		
			
			System.out.println(studentPark);		// 참조값
			System.out.println(studentLee);			// 참조값
	}

}
