
public class CommandLineDemo {
	public static void main(String[] args) {
	
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i] + 222);
		}	
		
		for(int i = 0; i<args.length; i++) {
			System.out.println(Integer.parseInt(args[i]) + 222);
		}	
		
		
		String num1 = "100";
		
		int i = Integer.parseInt(num1);
		//System.out.println(i+10);
		
		
		
	}
}
