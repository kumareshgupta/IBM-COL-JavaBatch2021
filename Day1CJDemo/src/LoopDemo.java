
public class LoopDemo {
	public static void main(String[] args) {		
		int count = 0;		
		while (count > 0) {
			System.out.println("while " + count);
			count--;
		}
		
		
		do {
			System.out.println("do - while " + count);
			count--;
		}while(count > 0);
		
		//at least one execution of loop
	}
}
