package array;

public class Book {
	
	private String bookName;		// 멤버변수 두가지
	private String author;
	
	public Book() {}
	public Book(String bookName, String author) {		// construct 2가지 만듦.
		this.bookName = bookName;
		this.author = author;
	}
	
	
	// ******************* private 변수들을 위한 get,set method 를 제공해 준다. ******************* //
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// ******************* 정보를 나타내주는 메소드. 하나를 추가. ******************* //
	public void showBookInfo() {
		System.out.println(bookName + "," + author);		// 멤버변수2개를 출력해주는 메소드를 만들어줌.
	}
	
	
}
