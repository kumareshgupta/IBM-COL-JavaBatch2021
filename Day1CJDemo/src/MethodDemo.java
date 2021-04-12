
public class MethodDemo {
	
	public static void displayArray(String [] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].toUpperCase());
		}
	}
	
	public static int getNumberOfElements(String [] arr) {
		return arr.length;
	}

	public static void main(String[] args) {
		
		String [] fruits = {"Banana", "Apple", "Mango", "Strawberry"};
		displayArray(fruits);		
		int len = getNumberOfElements(fruits);
		System.out.println(len);
	}

}
