package singleton;

public class Company {

	private static Company instance = new Company();	// (2)유일하게 생성되는 객체를 만들어서,(private으로)
	
	private Company(){}		// (1)컨스트럭트를 private으로 생성을 해주고,
	
	public static Company getInstace() {	// (3)위의 객체를 가져갈 수 있는 public메서드를 static으로 제공을해야
		if(instance == null)				// 객체를 생성하지 않고, class이름으로 참조해서 사용할 수 있다.
			instance = new Company();
		
		return instance;
	}
}
