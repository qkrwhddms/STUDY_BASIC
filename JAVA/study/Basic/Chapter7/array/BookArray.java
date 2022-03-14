package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];		// 5개 배열을 만듦.
		
		for(int i = 0; i < library.length; i++) {		// 전체를 다 돌리려면 length를 사용.
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥1", "조정래");		// 인스턴스 생성해서 각 배열에 요소에 넣어줌.
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i = 0; i < library.length; i++) {		// 주소값 출력.
			System.out.println(library[i]);
			
		}
		
		for(int i = 0; i < library.length; i++) {		// 각 배열 요소를 꺼내서 메서드를 호출.
			library[i].showBookInfo();
			
		}
	}

}
