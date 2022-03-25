package arraylist;

public class Subject {

	private String name;		//	과목이름, 과목점수 두가지의 요소를 만들어줌. 
	private int scorePoint;
	
	public String getName() {		// 요소를 만들어 주었으니 get,set을 생성 (alt+shift+s 후에 r)
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
}
