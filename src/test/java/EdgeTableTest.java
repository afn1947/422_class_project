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
		testObjTable3 = new EdgeTable("3|testName3");
	}

	@Test
	public void testgetNumFigure1() {
      assertEquals("NumFigure was initialized to 2",2,testObjTable.getNumFigure());
  }

	@Test
	public void testgetNumFigure2() {
      assertEquals("NumFigure was initialized to 1",1,testObjTable2.getNumFigure());
  }

	@Test
	public void testgetNumFigure3() {
      assertEquals("NumFigure was initialized to 3",3,testObjTable3.getNumFigure());
  }
   
	@Test
  public void testGetName1() {
		assertEquals("Name was initialized to","testName1",name,testObjTable1.getName());
  }

	@Test
  public void testGetName2() {
		assertEquals("Name was initialized to","testName2",name,testObjTable2.getName());
  }

	@Test
  public void testGetName3() {
		assertEquals("Name was initialized to","testName3",name,testObjTable3.getName());
  }
   
	@Test
  public void testAddRelatedTable() {
		testObjTable1.addRelatedTable(3);
		testObjTable1.makeArrays();
		assertNotNull("Related Field should not be null",1,testObjTable1.getRelatedFieldsArray());
		assertEquals("Related Field should be what is in it",1,testObjTable1.getRelatedFieldsArray().length);
		assertEquals("Related Field should be what you added to it",3,testObjTable1.getRelatedFieldsArray()[0]);
	}
   
	@Test
  public void TestGetRelatedTablesArray() {
		assertEquals("Related Tables should be 0",0,testObjTable1.getRelatedTablesArray());
	}
   
	@Test
  public void testGetRelatedFieldsArray() {
		assertEquals("Related Fields should be 0",0,testObjTable1.getRelatedFieldsArray());
	}
   
	@Test
  public void testSetRelatedField() {
		testObjTable1.setRelatedField(1,2);
		assertEquals("Related Field should be what you set it to",1,2,testObjTable1.getRelatedFieldsArray());
	}
   
	@Test
  public void testGetNativeFieldsArray() {
			assertEquals("Native Fields should be 0",0,testObjTable1.getRelatedNativeArray());
	}

	@Test
  public void testAddNativeField() {
		testObjTable1.addNativeField(3);
		testObjTable1.makeArrays();
		assertNotNull("Native Field should not be null",1,testObjTable1.getNativeFieldsArray());
		assertEquals("Native Field should be what is in it",1,testObjTable1.getNativeFieldsArray().length);
		assertEquals("Native Field should be what you added to it",3,testObjTable1.getNativeFieldsArray()[0]);
	}

	@Test
  public void testMoveFieldUp() {
		testObjTable1.addNativeField(3);
		testObjTable1.makeArrays();
		testObjTable1.moveFieldUp(3);
		assertEquals("The file should have been moved up",3,testObjTable1.getRelatedFieldsArray().length);
	}

  @Test 
  public void testMoveFieldDown() {
		testObjTable1.addNativeField(3);
		testObjTable1.makeArrays();
		testObjTable1.moveFieldDown(3);
		assertEquals("The file should have been moved down",3,testObjTable1.getRelatedFieldsArray().length);
	}

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
	}
      
	@Test
  public void testToString() {
		testObjTable1.toString();
		assertEquals("The String should be equal to whatever you set it to","testGetName1");
	} // End of 

}