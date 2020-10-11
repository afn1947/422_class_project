import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {
	private EdgeTable testObjTable;

	// Runs each time before the tests 
	@Before
	public void setUp() throws Exception {
		testObjTable1 = new EdgeTable("2|testName1");
		testObjTable2 = new EdgeTable("1|testName2");
	} // End of contructor

	@Test
	public void testGetNumFigure1() {
      assertEquals("NumFigure was initialized to 2",2,testObjTable.getNumFigure());
  } // End of testGetNumFigure1

	@Test
	public void testGetNumFigure2() {
      assertEquals("NumFigure was initialized to 1",1,testObjTable2.getNumFigure());
  } // End of testGetNumFigure2
   
	@Test
  public void testGetName1() {
		assertEquals("Name was initialized to","testName1",name,testObjTable1.getName());
  } // End of testGetName1

	@Test
  public void testGetName2() {
		assertEquals("Name was initialized to","testName2",name,testObjTable2.getName());
  } // End of testGetName2
   
	@Test
  public void testAddRelatedTable() {
		testObjTable1.addRelatedTable(3);
		testObjTable1.makeArrays();
		assertNotNull("Related Field should not be null",1,testObjTable1.getRelatedFieldsArray());
		assertEquals("Related Field should be what is in it",1,testObjTable1.getRelatedFieldsArray().length);
		assertEquals("Related Field should be what you added to it",3,testObjTable1.getRelatedFieldsArray()[0]);
	} // End of testAddRelatedTable
   
	@Test
  public void testGetRelatedTablesArray() {
		assertEquals("Related Tables should be 0",0,testObjTable1.getRelatedTablesArray());
	} // End of testGetRelatedTablesArray
   
	@Test
  public void testGetRelatedFieldsArray() {
		assertEquals("Related Fields should be 0",0,testObjTable1.getRelatedFieldsArray());
	} // End of testGetRelatedFieldsArray
   
	@Test
  public void testSetRelatedField() {
		testObjTable1.setRelatedField(1,2);
		assertEquals("Related Field should be what you set it to",1,2,testObjTable1.getRelatedFieldsArray());
	} // End of testSetRelatedField
   
	@Test
  public void testGetNativeFieldsArray() {
			assertEquals("Native Fields should be 0",0,testObjTable1.getRelatedNativeArray());
	} // End of testGetNativeFieldsArray

	@Test
  public void testAddNativeField() {
		testObjTable1.addNativeField(3);
		testObjTable1.makeArrays();
		assertNotNull("Native Field should not be null",1,testObjTable1.getNativeFieldsArray());
		assertEquals("Native Field should be what is in it",1,testObjTable1.getNativeFieldsArray().length);
		assertEquals("Native Field should be what you added to it",3,testObjTable1.getNativeFieldsArray()[0]);
	} // End of testAddNativeField

	@Test
  public void testMoveFieldUp() {
		testObjTable1.addNativeField(3);
		testObjTable1.makeArrays();
		testObjTable1.moveFieldUp(3);
		assertEquals("The file should have been moved up",3,testObjTable1.getRelatedFieldsArray().length);
	} // End of testMoveFieldUp

  @Test 
  public void testMoveFieldDown() {
		testObjTable1.addNativeField(3);
		testObjTable1.makeArrays();
		testObjTable1.moveFieldDown(3);
		assertEquals("The file should have been moved down",3,testObjTable1.getRelatedFieldsArray().length);
	} // End of testMoveFieldDown

  @Test
	public void testMakeArrays() {
		testObjTable1.addNativeField(4);
		testObjTable1.addNativeField(5);
		testObjTable1.addNativeField(6);
		testObjTable1.makeArrays();
		assertNotNull("Native Field should not be null",1,testObjTable1.getNativeFieldsArray());
		assertEquals("Native Field should be what is in it",4,testObjTable1.getNativeFieldsArray().length);
		assertEquals("Native Field should be what is in it",5,testObjTable1.getNativeFieldsArray().length);
		assertEquals("Native Field should be what is in it",6,testObjTable1.getNativeFieldsArray().length);
	} // End of testMakeArrays
      
	@Test
  public void testToString() {
		String expected = "This is a test";
		assertEquals(testObjTable.toString().expected);
	} // End of testToString
} // End of EdgeTableTest