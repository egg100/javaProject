package objects2;

public class LibraryExe {
	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("어린왕자", "생택쥐페리", "황금가지", 8000);
		books[1] = new Book("연금술사", "파울로코엘료", "창비", 8000);
		books[2] = new Book("데미안", "헤르만헤세", "민음사", 8000);
		books[3] = new Book("자바", "저자1", "한빛", 12000);
//		books[4] = new Book("자바스크립트", "저자2", "한빛", 10000);
		
		System.out.println(books[0].getTitle());
		
		Member mem1 = new Member("s111", "박효정");
		mem1.rent(books[0]);
		mem1.rent(books[1]);
		mem1.overdue(books[1]);

//		System.out.println(books[4].getTitle());
		
		
		mem1.getBookInfo();
		
		Member mem2 = new Member("s222", "김한설");
		mem2.rent(books[2]);
		mem2.rent(books[3]);
		
		mem2.getBookInfo();

	}
}
