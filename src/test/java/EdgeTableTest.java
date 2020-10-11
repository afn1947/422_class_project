import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {
	private EdgeTable testObjTable;

	// Runs each time before the tests - should be 12 tests
	@Before
	public void setUp() throws Exception {
		testObjTable = new EdgeTable("2|testName");
	}

	@Test
	public void testgetNumFigure() {
      assertEquals("NumFigure was initialized to 2",2,testObjTable.getNumFigure());
  }
   
	@Test
  public void testGetName() {
		assertEquals("Name was initialized to","testName",name,testObjTable.getName());
  }
   
	@Test
  public void testAddRelatedTable() {
	}
   
	@Test
  public void TestGetRelatedTablesArray() {
		assertEquals("Related Tables should be 0",0,testObjTable.getRelatedTablesArray());
	}
   
	@Test
  public void testGetRelatedFieldsArray() {
		assertEquals("Related Fields should be 0",0,testObjTable.getRelatedFieldsArray());
	}
   
	@Test
  public void testSetRelatedField() {}
   
	@Test
  public void testGetNativeFieldsArray() {
			assertEquals("Native Fields should be 0",0,testObjTable.getRelatedNativeArray());
	}

	@Test
  public void testAddNativeField() {}

	@Test
  public void testMoveFieldUp() {}

  @Test 
  public void testMoveFieldDown() {}

  @Test
	public void testMakeArrays() {}
      
	@Test
  public void testToString() {}

}