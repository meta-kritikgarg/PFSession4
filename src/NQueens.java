import java.util.Scanner;

//Assignment 2
public class NQueens {

	 char[][] board;
	 
	 char QUEEN = 'Q';

	 public static void main(String[] args) {
		 	NQueens nq = new NQueens();
		 	int tmp= nq.getIntfromUser("Size of board");
		 	nq.solveQueenProblem(tmp);
		 	nq.showBoard(tmp);
	    }
	 
	 
	 /**
	  * Method to check is it possible to place Queen 
	  * @param row int row no
	  * @param column int column no
	  * @param n size of board
	  * @return boolean
	  */
	 public boolean isPossible(int row,int column, int n) {
    	//Test for row and column
    	for(int i=0;i<n;i++)
    	{
    		if(board[i][column]==QUEEN||board[row][i]==QUEEN)
    		{
    			return false;
    		}
    	}
    	
    	//Test for Diagonal
    	int total= row+column;
    	int difference =row-column;
    	for(int i=0;i<n;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    		{
	    			//Major diagonal or Minor Diagonal
	    			if((i-j)==difference||(i+j)==total)
	    			{
	    				if(board[i][j]==QUEEN)
	    				{
	    					return false;
	    				}
	    			}		
	    		}
	    	}
    	 return true;
    	}
    
	   
	 	/**
	 	 * Method to print board
	 	 * @param n size
	 	 * @return char[][] solution
	 	 */
	    public char[][] showBoard(int n)
	    {
	    	for(int row=0;row<n;row++)
	    	{
	    		for(int column=0;column<n;column++)
	    			{
	    				System.out.print(board[row][column]+" ");
	    			}
	    		System.out.println();
	    	}
	    	return board;
	    }
	    
	    
	    /**
	     * Sets board
	     * @param n size 
	     */
	    public void setBoard(int n) {
	    	board = new char[n][n];
	    	for(int row=0;row<n;row++)
	    	{
	    		for(int column=0;column<n;column++)
	    		{
	    			board[row][column]='*';
	    		}
	    	}
		}
	    
	    
	    /**
	     * Method to solve queens problem
	     * @param n int size of board
	     */
	    public void solveQueenProblem(int n) {
			setBoard(n);
			if(!setQueen(0, n))
			{
				System.out.println("Solution not feasible");
			}
		}
	    
	    
	    /**
	     * Method to set position of queen recursively 
	     * @param k int row no
	     * @param n int size of board
	     * @return true if done, else false
	     */
	    private boolean setQueen(int k,int n)
	    {
	    	if(k==n)
	    	{
	    		return true;
	    	}
		    	for(int i=0;i<n;i++)
		    	{
		    		//System.out.println("i="+i+" k="+k);
		    		if(isPossible(k, i, n))
		    		{
		    			board[k][i]=QUEEN;
			    		//System.out.println("Set at"+i+""+k);
		    			if(setQueen(k+1, n))
		    			{
		    				return true;
		    			}
		    			board[k][i]='*';
		    		}
		    	}
		    	return false;
	    }
	    
	    
	    
	    /**
		 * Method to read integer data from standard input
		 * @param Name of variable to print 
		 * @return int value of integer
		 */
		public int getIntfromUser(String Name) 
		{
			Scanner s= new Scanner(System.in);
			int number = 0;		
			while(true){
				try {
					System.out.println("Enter "+Name);
					number=s.nextInt();
					if(number>0)
					{
						break;
					}
					else
					{
						System.out.println("Invalid, Try Again");
					}
				} catch (Exception e) {
					System.out.println("Invalid, Try again");
					s.next();
				}
			}
			return number;
		}
	    
}