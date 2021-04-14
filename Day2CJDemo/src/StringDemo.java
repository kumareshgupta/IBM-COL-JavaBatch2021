
public class StringDemo {

	public static void main(String[] args) {

		String name1 = "Manipal";		
		String name2 = "Manipal";
		
		String name3 = new String("Manipal");
		String name4 = new String("Manipal");
		
		// == compare references
		System.out.println(name1 == name2); //1. true
		
		System.out.println(name1 == name3); //2. false
		
		System.out.println(name3 == name4);//3. false
		
		System.out.println("--------equals ------------------");
		//equals compare values
		System.out.println(name1.equals(name2)); //1. true
		
		System.out.println(name1.equals(name3)); //2. true
		
		System.out.println(name3.equals(name4));//3. true
		
		name1 = name1.concat("UNext");
		System.out.println(name1);
		System.out.println(name1 == name2); //1. true
		//Strings are immutable
		
	}

}
