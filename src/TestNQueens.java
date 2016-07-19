import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;


public class TestNQueens {

	//Test cases for NQueens Problem
	@Test
	public void testSolveQueenProblem() {
		NQueens nq= new NQueens();
		char[][] expacted = {{'*','Q','*','*'},{'*','*','*','Q'},{'Q','*','*','*'},{'*','*','Q','*'}};
		nq.solveQueenProblem(4);
		char[][] actual = nq.showBoard(4);
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				assertEquals(expacted[i][j], actual[i][j]);
			}
			
		}
	}
}
