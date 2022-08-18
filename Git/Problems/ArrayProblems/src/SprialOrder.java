
public class SprialOrder {
	private static void spiralMatrix(int[][] matrix, int rowE, int colE) {
		int rowS = 0,colS = 0;
		//rowE-> row end index
        //rowS->row start index
		//colE->column End index
		//colS->column start index
		
		
		while(rowS < rowE && colS < colE) {
			for(int i = colS; i < colE; i++) {
				System.out.print(","+matrix[rowS][i]);
			}
			rowS++;
			for(int i = rowS ; i < rowE; i++ ) {
				System.out.print(","+matrix[i][colE-1]);
			}
			colE--;
			if(rowS < rowE) {
				for(int i = colE-1; i >= colS; i--) {
					System.out.print(","+matrix[rowE-1][i]);
				}
				rowE--;
			}
			if(colS < colE) {
				for(int i = rowE-1; i >= rowS; i--) {
					System.out.print(","+matrix[i][colS]);
				}
				colS++;
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		int matrix[][] = {{1,3,4}, {8,3,4}, {5,8,5}, {6,8,4}};
	//	1 3 4 5
	//	8 3 4 2 
	//	5 8 5 5 
	//	6 8 4 2
	//	output -> 1 3 4 5 2 5 2 4 8 6 5 8 3 4 5 5 
		         // 1,3,4,5,2,5,2,4,8,6,5,8,3,4,5,5
		int R = 4;
		int C = 3;
		spiralMatrix(matrix, R, C);
	}

}
