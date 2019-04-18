package pkg;
//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitTesting j = new JUnitTesting();
		String res = j.addString("abc","def");
		assertEquals("abcdef",res); 		//Correct Test Case
		
//		String res2 = j.addString("hi"," hello");
//		assertEquals("hi hey",res2);		//Incorrect Test Case
	}

}
