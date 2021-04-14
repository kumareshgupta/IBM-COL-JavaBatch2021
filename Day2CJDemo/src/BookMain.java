
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookInfo book1 = new BookInfo(); //no-arg constructor
		
		// call a method
		book1.getBookDetails();	
		
		/*book1.bookId = -110;
		book1.bookTitle = "Web Programming in a day";
		book1.author = "Bala";
		book1.price = -200.00; */
		
		book1.setBookId(333);
		book1.setBookTitle("Full Stack Programming");
		System.out.println("-----------after changing values......");
		String title = book1.getBookTitle();
		System.out.println("Title : " + title);
		System.out.println("Title : " + book1.getBookTitle());
		
	}

}
