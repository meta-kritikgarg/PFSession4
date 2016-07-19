import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestPrintCombitation {

	//Test case for Permutations of string
	@Test
	public void testGeneratePermutations() {
		PrintCombitation pc = new PrintCombitation();
		
		ArrayList<String> expacted = new ArrayList<String>();
		expacted.add("cba");
		expacted.add("bca");
		expacted.add("acb");
		expacted.add("cab");
		expacted.add("abc");
		expacted.add("bac");
		ArrayList<String> actual = new ArrayList<String>();
		actual = pc.generatePermutations("abc");
		
		for (int i = 0; i < expacted.size(); i++) {
			assertEquals(expacted.indexOf(i), actual.indexOf(i));	
		}
	}

}
