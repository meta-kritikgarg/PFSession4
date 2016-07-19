import java.util.ArrayList;
import java.util.Scanner;
//Assignment 1 b
public class PrintCombitation {
	char[] ch ;
	ArrayList<String> output = new ArrayList<String>();


	public static void main(String[] args) {
		PrintCombitation pc = new PrintCombitation();
		String tmp = pc.getStringfromUser("String");
		pc.generatePermutations(tmp);
		
	}
	
	
	/**
	 * Method to generate all possible permutations of a string
	 * @param input String
	 * @return ArrayList<String> output
	 */
	public ArrayList<String> generatePermutations(String input) {
		int end= input.length();
		ch = input.toCharArray();
		generateAllCase(end-1);
		for (String string : output) {
			System.out.println(string);
		}
		return output;
	}
	
	
	/**
	 * Method for internal use to generate combinations
	 * @param end int last index of String
	 */
	private void generateAllCase(int end)
	{
		if(end==0)
		{
			printch();
			return ;
		}
		for(int i=0; i<=end;i++)
		{
			swap(i, end);
			printch();
			generateAllCase(end-1);
			swap(i,end);
		}
	}
	
	
	/**
	 * Method to swap char at i to chat at j
	 * @param i int
	 * @param j int
	 */
	private void swap(int i,int j)
	{
		char t = ch[i];
		ch[i] = ch[j];
		ch[j] = t;
	}
	
	
	/**
	 * Method to store generated output to ArrayList
	 */
	public void printch() {
		String x ="";
		for (char c : ch) {
			x=x+c;
		}
		if(!output.contains(x))
		{
			output.add(x);
		}
	}
	
	
	/**
	 * Method to read string data from standard input
	 * @param Name of variable to print 
	 * @return String value input by user
	 */
	public String getStringfromUser(String Name) 
	{
		Scanner s= new Scanner(System.in);
		String string = "";		
		while(true){
			try {
				System.out.println("Enter "+Name);
				string=s.next();
				if(string.length()>0)
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
		return string;
	}

}
