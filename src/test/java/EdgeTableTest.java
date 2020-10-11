import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {

	// Runs each time before the tests - should be 12 tests
	@Before
	public void setUp() throws Exception {
		testObj = new EdgeTable("1|2|3|testStyle1|testStyle2");
	}

	@Test
	public int TestgetNumFigure() {
      
  }
   
	@Test
  public String TestGetName() {

  }
   
	@Test
  public void TestAddRelatedTable(int relatedTable) {

  }
   
	@Test
  public int[] TestGetRelatedTablesArray() {

  }
   
	@Test
  public int[] TestGetRelatedFieldsArray() {

  }
   
	@Test
  public void TestSetRelatedField(int index, int relatedValue) {
      
  }
   
	@Test
  public int[] TestGetNativeFieldsArray() {

  }

	@Test
  public void TestAddNativeField(int value) {

  }

	@Test
  public void TestMoveFieldUp(int index) { 
     
   }

  @Test 
  public void TestMoveFieldDown(int index) { 
     
  }

  @Test
	public void TestMakeArrays() { 

  }
      
	@Test
  public String TestToString() {
	}

}