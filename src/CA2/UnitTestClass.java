package CA2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert;

public class UnitTestClass {
	
	@Test
	public void testCriteria() {
		Controller c = new Controller();
		
		assertTrue(c.checkStringInput("test"));
	}

}
