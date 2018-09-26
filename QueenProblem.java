

public class QueenProblem {
	
	public static void main(String[] args) {
		QueenProblem q = new QueenProblem(4);
		q.solve();
	}
	
	private int[][] chessTable;
	private int numOfQueens;
	
	public QueenProblem(int numOfQueens){
		this.chessTable = new int[numOfQueens][numOfQueens];
		this.numOfQueens = numOfQueens;
	}
	
	public void solve(){
		if(setQueen(0)){
			printQueen();
		} else{
			System.out.println("There is no solution..");
		}
	}

	private boolean setQueen(int colIndex) {
		
		if(colIndex == numOfQueens)
			return true;
		
		for(int rowIndex=0; rowIndex<numOfQueens; ++rowIndex){
			
			if(isPlaceValid(rowIndex, colIndex)){
				chessTable[rowIndex][colIndex] = 1;
				if(setQueen(colIndex+1)){
					return true;
				}
				
				// backtrack
				chessTable[rowIndex][colIndex] = 0;
			}
		}
		
		
		return false;
	}

	private boolean isPlaceValid(int rowIndex, int colIndex) {
		
		for(int i=0; i<colIndex; i++ ){
			if(chessTable[rowIndex][i] ==1)
				return false;
		}
		
		for(int i=rowIndex,j=colIndex;i>=0 && j>=0;i--,j--){
			if(chessTable[i][j] == 1)
				return false;
		}
		
		for(int i=rowIndex, j=colIndex;i<chessTable.length && j>=0;i++,j--){
			if(chessTable[i][j] == 1){
				return false;
			}
		}
		
		return true;
	}

	private void printQueen() {
		for (int i = 0; i < chessTable.length; i++) {
			for (int j = 0; j < chessTable.length; j++) {
				if (chessTable[i][j] == 1) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}

	}

}
