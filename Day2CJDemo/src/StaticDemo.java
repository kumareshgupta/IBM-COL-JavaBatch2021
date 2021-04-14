
public class StaticDemo {
	int num1; //instance variable
	static int count; //class variable
	
	StaticDemo(){
		num1++;
		count++;
	}
	
	void display() {
		System.out.println(num1);
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("count : " + count);
		
		StaticDemo staticDemo = new StaticDemo();
		System.out.println("num1 : " + staticDemo.num1); //1
		System.out.println("count : " + count); //1
		
		System.out.println("--creating object 2 ------");
		StaticDemo staticDemo1 = new StaticDemo();
		System.out.println("num1 : " + staticDemo1.num1); //1
		System.out.println("count : " + count); //2
		
		
		System.out.println("--creating object 3 ------");
		StaticDemo staticDemo2 = new StaticDemo();
		System.out.println("num1 : " + staticDemo1.num1); //1
		System.out.println("count : " + count); //3
		
		System.out.println(StaticDemo.count); //recommended
		System.out.println(staticDemo.count); //not recommended
		
		
		
	}

}
