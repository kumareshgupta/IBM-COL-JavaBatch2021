import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name : ");
		String name = scanner.nextLine();
		System.out.println(name);
		System.out.println("Enter age : ");
		int age = scanner.nextInt();
		System.out.println(age);
		
	}

}
