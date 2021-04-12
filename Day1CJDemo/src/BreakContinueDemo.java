
public class BreakContinueDemo {

	public static void main(String[] args) {
		System.out.println("\nbreak demo ......");
		for(int i = 0; i < 10; i++) {			
			if(i == 6)
				break;	
			System.out.print(i + " ");
		}
		System.out.println("\ncontinue demo ......");
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 6) 
				continue;
				
			System.out.print(i + " ");
		}
	}

}
