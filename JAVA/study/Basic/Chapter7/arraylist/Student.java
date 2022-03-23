package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;			// 학번
	private String studentName;		// 이름
	private ArrayList<Subject> subjectList;			// 학생이 가지고있는 과목들을 배열로.
	
	public Student(int studentID, String studentName) {			// 학생 생성자는 학번과 이름을 가져와라.
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {		// 배열에 추가될 수 있는 메서드를 만듦.
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {				// 학생 정보
		
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			
			System.out.println("학생 " + studentName + " 님의 " + subject.getName() + " 과목의 성적은 "
					+ subject.getScorePoint() + "점 입니다.");
		}
		
		System.out.println("학생 " + studentName + " 님의 총점은 " + total + " 점 입니다.");
	}
	
}
