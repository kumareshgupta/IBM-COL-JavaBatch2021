public class BookInfo {
	//instance variables
	private int bookId;
	private String bookTitle;
	private String author;
	private double price;
	
	//constructor

	BookInfo(){
		bookId = 100;
		bookTitle = "Core Java";
		author = "Balaguruswamy";
		price = 399.00;
	} 
	BookInfo(int bid, String title, String authorName, double bookPrice){
		bookId = bid;
		bookTitle = title;
		author = authorName;
		price = bookPrice;		
	}
	
	public void setBookId(int bookId){
		this.bookId = bookId;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle(){
		return bookTitle;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	//method
	void getBookDetails() {
		System.out.println(bookId + "\n" + bookTitle + "\n" +author + "\n" + price);
	}


}






/*public class BookInfo {
	//instance variables
	private int bookId;
	private String bookTitle;
	private String author;
	private double price;
	
	//constructor

	BookInfo(){
		bookId = 100;
		bookTitle = "Core Java";
		author = "Balaguruswamy";
		price = 399.00;
	} 
	BookInfo(int bid, String title, String authorName, double bookPrice){
		bookId = bid;
		bookTitle = title;
		author = authorName;
		price = bookPrice;		
	}
	
	//method
	void getBookDetails() {
		System.out.println(bookId + "\n" + bookTitle + "\n" +author + "\n" + price);
	}

	//execution point 
	public static void main(String[] args) {
		//create object
		BookInfo book1 = new BookInfo(); //no-arg constructor
		
		// call a method
		book1.getBookDetails();	
		
		book1.bookId = -110;
		book1.bookTitle = "Web Programming in a day";
		book1.author = "Bala";
		book1.price = -200.00;
		
		System.out.println("after changing values......");
		book1.getBookDetails();	
		
		
		
	}

}*/
