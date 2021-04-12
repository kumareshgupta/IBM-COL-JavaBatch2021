
public class ArraysDemo {

	public static void main(String[] args) {
		int marks[] = new int[3];
		marks = new int[]{45,46,49};
		
		/*marks[0] = 45;
		marks[1] = 46;
		marks[2] = 49;*/
		//marks[3] = 50;
		
		int[] marks1 = {45, 46 ,49}; //marks of 3 subjects of 1 student
		
		int sum = 0;
		for(int i = 0; i< marks.length; i++) {
			sum = sum + marks[i];
			System.out.println(marks[i]);
		}
		System.out.println("Total " + sum);
		
		
	}

}
