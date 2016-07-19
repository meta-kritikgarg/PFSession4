import java.util.ArrayList;
import java.util.Scanner;

//Assignment 1 a
public class TowerOfHanoi {
	
	private ArrayList<String> solution=new ArrayList<String>();

	public static void main(String[] args) {
		
		TowerOfHanoi toh= new TowerOfHanoi();
		int in =toh.getIntfromUser("Elements");
		ArrayList<String> out = toh.solveTOH(in);
		/*System.out.println("Solution ->");	
		for (String string : out) {
			System.out.println(string);
		}*/
	}
	
	
	/**
	 * Method to solve tower of hanoi
	 * @param n int no of elements
	 * @return ArrayList<String> solution
	 */
	public ArrayList<String> solveTOH(int n) {
		//int noOfSolution= (int) (Math.pow(2, n)-1);
		solve(n, "A", "B", "C");
		for (String string : solution) {
			System.out.println(string);
		}
		return solution;
	}
	
	/**
	 * Method to solve tower of Hanoi problem
	 * @param n int no of elements
	 * @param start String name of origin tower
	 * @param auxiliary String name of temporary tower
	 * @param end name of final tower
	 */
	private void solve(int n, String start, String auxiliary, String end) {
		
		if(n==1)
		{
			String tmp = start+ " -> "+end+" Disk "+n;
			//System.out.println(tmp);
			solution.add(tmp);
			
		}
		else
		{
			solve(n-1, start, end, auxiliary);
			String tmp = start+ " -> "+end+" Disk "+n;
			//System.out.println(start+ " -> "+end);
			solution.add(tmp);
			solve(n-1, auxiliary, start, end);
		}
		
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
