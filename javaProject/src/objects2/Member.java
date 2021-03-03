package objects2;

public class Member {
	private String id;
	private String name;
	private Book[] rentBooks = new Book[5];
	
	public Member() {
		
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void rent(Book book) {
		for(int i = 0; i < rentBooks.length; i++) {
			if(rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}
	
	public void overdue(Book book) {
		for(int i = 0; i < rentBooks.length; i++) {
			if(rentBooks[i] == book) {
				rentBooks[i] = null;
				break;
			}
//			if(rentBooks[i] != null) {
//				if(rentBooks[i].getTitle().equals(book.getTitle())) {
//					rentBooks[i] = null;
//					break;
//				}
//			}
		}
	}

	public void getBookInfo() {
		System.out.print(name + " - ");
		for(int i = 0; i < rentBooks.length; i++) {
			if(rentBooks[i] != null) {
				System.out.print(rentBooks[i].getTitle() + " / ");				
			}
		}
		System.out.println("");
	}
}
