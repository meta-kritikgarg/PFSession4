import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestTowerOfHanoi {

	//Test case for tower of Hanoi
	@Test
	public void testSolveTOH() {
		TowerOfHanoi toh = new TowerOfHanoi();
		
		ArrayList<String> expacted=new ArrayList<String>();
		expacted.add("A -> C Disk 1");
		expacted.add("A -> B Disk 2");
		expacted.add("C -> B Disk 1");
		expacted.add("A -> C Disk 3");
		expacted.add("B -> A Disk 1");
		expacted.add("B -> C Disk 2");
		expacted.add("A -> C Disk 1");
		
		ArrayList<String> actual = toh.solveTOH(3);
		for (int i = 0; i < expacted.size(); i++) {
			assertEquals(expacted.indexOf(i), actual.indexOf(i));
		}
		
		
	}

}
