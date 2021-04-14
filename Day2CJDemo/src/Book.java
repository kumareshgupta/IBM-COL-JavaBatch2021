
public class Book {
	//instance variables
	int bookId;
	String bookTitle;
	String author;
	double price;
	
	//constructor

	Book(){
		bookId = 100;
		bookTitle = "Core Java";
		author = "Balaguruswamy";
		price = 399.00;
	} 
	Book(int bid, String title, String authorName, double bookPrice){
		bookId = bid;
		bookTitle = title;
		author = authorName;
		price = bookPrice;		
	}
	Book(String title){
		bookTitle = title;
	}
	
	//method
	void getBookDetails() {
		System.out.println(bookId + "\n" + bookTitle + "\n" +author + "\n" + price);
	}

	//execution point 
	public static void main(String[] args) {
		//create object
		//Book book = new Book(100, "Core Java", "Balaguruswamy", 399.00); //  creating object by using parameterized constructor
		Book book1 = new Book(); //no-arg constructor
		Book book2 = new Book();
		// call a method
		book1.getBookDetails();	
		book2.getBookDetails();
		
		System.out.println("Using parameterized constructor----");
		Book book3 = new Book(100, "Core Java", "Balaguruswamy", 399.00);
		Book book4 = new Book(101, "Advanced Java", "James Gosling", 599.00);
		
		book3.getBookDetails();
		book4.getBookDetails();
		
		
		Book book5 = new Book("Spring Framework");
		book5.getBookDetails();
		
		int i = 100;
		String s = i +"";
		
	}

}
