package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{1,2,3,4}};
		
		int i,j;
		
		for (i = 0; i<arr.length;i++) {
			for(j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println("\t");
		}
	
	}

}
