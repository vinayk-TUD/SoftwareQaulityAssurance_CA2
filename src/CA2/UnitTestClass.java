package CA2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.Assert;

public class UnitTestClass {
	
	@Test
	public void testStringInput() {
		Controller c = new Controller();
		
		assertTrue(c.checkStringInput("test"));
	}
	
	@Test
	public void testScoreInput() {
		Controller c = new Controller();
		
		assertTrue(c.checkScoreInput("3"));
	}
	@Test
	public void testaddRubric() {
		Controller c = new Controller();
		//Rubric r = c.addRubric("testName");
		
		assertNotNull(c.addRubric("testName"));
	}
	
	@Test
	public void testcreatecriterion() {
		Controller c = new Controller();
		//Rubric r = c.addRubric("testName");
		
		assertNotNull(c.createCriterion("test"));
	}
	@Test
	public void testAddCriterion() {
		Controller c = new Controller();
		Rubric r = new Rubric("test");
		c.rubricList.add(r);
		
		assertEquals(" Added criteria ", c.addCriterion("test", "test"));
	}
	
	@Test
	public void testRubricName() {
		Controller c = new Controller();
		Rubric r = new Rubric("test");
		c.rubricList.add(r);
		
		assertEquals(r, c.getRubricName("test"));
	}
	
	@Test
	public void testAddGrade() {
		Controller c = new Controller();
		Rubric r = new Rubric("test");
		
		assertNotNull(c.addGrade("test", r));
	}
	
	@Test
	public void testListRubrics() {
		Controller c = new Controller();
		
		assertEquals(c.rubricList,c.listRubrics());
	}
	@Test
	public void testListGrades() {
		Controller c = new Controller();
		
		assertEquals(c.gradeList,c.listGrades());
	}
	
	@Test
	public void testGradeByName() {
		Controller c = new Controller();
		c.addGrade("test", new Rubric("r"));
		asserttrue(c.getRubricName("test"));
	}
}//end test class 
