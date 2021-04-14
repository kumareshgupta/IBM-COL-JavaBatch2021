package info;
//import demo.Account;
//import demo.Employee;
import demo.*;
import demo.pack1.Book;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();
		
		Account account = new Account();
		account.show();
		
		Book book = new Book();
		book.showBooks();
	}

}
