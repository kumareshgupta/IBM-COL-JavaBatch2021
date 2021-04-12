
public class ArraysDemo2 {

	public static void main(String[] args) {
		// store marks of 3 subject of 2 students
		
		int [][]marks = new int[2][3];
		marks = new int[][]{
						{45,46,49},
						{35,39,50}
						};		
		
		int[][] marks1 = {
				{45,46,49},
				{35,39,50}
				}; //marks of 3 subjects of 2 student
		
		int sum = 0;
		for(int i = 0; i< marks.length; i++) {
			System.out.println("\nStudent " + (i+1) );
			for(int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
		}
		
		
	}

}
