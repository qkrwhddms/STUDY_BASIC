import com.itwill.io.IO1;

/*
 * 클래스멤버(필드,메쏘드,생성자)의 접근을 제한하는 제한자
 * 		1. 클래스멤버의 접근제한
 *      2. 클래스의 멤버(필드,메쏘드,생성자)의 접근제한
 *      3. 접근제한자(public,protected,(default),private) 
 *      	A.public    : 외부모든 클래스(객체)에서 접근가능
 *      
 *          B.protected : 같은패키지에있는 모든클래스(객체) 에서접근가능
 *                        다른패키지에있는 모든클래스(객체) 에서접근불가능
 *                        다른패키지에있는 상속관계에있는 자식클래스에서접근가능
 *                        
 *          C.(default) : 같은패키지에있는 모든클래스(객체) 에서접근가능
 *                        다른패키지에있는 모든클래스(객체) 에서접근불가능
 * 			
 * 			D.private   : 외부모든 클래스(객체)에서 접근 불가능
 * 
 * 
 */
public class AccessModifierMain{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		자바에서제공하는 패키지이름과동일한패키지는 생성할수없다.
		<< Prohibited package name: java.lang >>
		 MyString myString=new MyString();
		 System.out.println(myString);
		 */
		/*
		ctrl + shift + o
		 */
		IO1 io1=new IO1();
		
		/*
		같은 패키지가아니면 사용불가능
		io1.protected_method();
		io1.default_method();
		*/
		IO1Child io1Child=new IO1Child();
		io1Child.access();
		
		/*
		 * protected로 선언된멤버는 상속받아 클래스를 생성한후 사용가능
		 */
	}

}
