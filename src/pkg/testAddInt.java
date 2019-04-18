package pkg;
//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddInt {

	@Test
	public void test() {
		JUnitTesting j = new JUnitTesting();
		int res = j.addInt(500,72); 
		assertEquals(572,res);   //Correct Test Case
		
//		int res2 = j.addInt(8,10);   
//		assertEquals(78,res2);  //Incorrect Test Case
	}

}
