import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* EdgeFieldTest is a class for making sure that an EdgeField is
* created correctly.
* @author Anna Jacobsen
* @version 10//11/2020
*/

public class EdgeFieldTest {
	private EdgeField testObj;

	@Before
	public void setUp() throws Exception {
		testObj = new EdgeField("2|testName");
	}

	@Test
	public void testGetNumFigure(){
		assertEquals("numFigure was intialized to 2", 2,testObj.getNumFigure());
	}

	@Test
	public void testGetName(){
		assertEquals("name was intialized to testName", "testName" ,testObj.getName());
	}

	@Test
	public void testGetTableID() {
		assertEquals("tableID should be 0", 0, testObj.getTableID());
	}

	@Test
	public void testSetTableID() {}

	@Test
	public void testGetTableBound() {
		assertEquals("tableBound should be 0", 0, testObj.getTableBound());
	}

	@Test
	public void testSetTableBound() {}

	@Test
	public void testGetFileBound() {
		assertEquals("fileBound should be 0", 0, testObj.getFileBound());
	}

	@Test
	public void testSetFileBound() {}

	@Test
	public void testGetDisallowNull() {
		assertEquals("disallowNull should be false", false, testObj.getDisallowNull());
	}

	@Test
	public void testSetDisallowNull() {}

	@Test
	public void testGetIsPrimaryKey() {
		assertEquals("isPrimaryKey should be false", false, testObj.getIsPrimaryKey());
	}

	@Test
	public void testSetIsPrimaryKey() {}

	@Test
	public void testGetDefaultValue() {
		assertEquals("defaultValue should be an empty String", "", testObj.getDefaultValue());
	}

	@Test
	public void testSetDefaultValue() {}

	@Test
	public void testGetVarCharValue() {
		assertEquals("varCharValue should be VARCHAR_DEFAULT_LENGTH", VARCHAR_DEFAULT_LENGTH, testObj.getVarcharValue());
	}

	@Test
	public void testSetVarCharValue() {}

	@Test
	public void testGetDataType() {
		assertEquals("dataType should be 0", 0, testObj.getDataType());
	}

	@Test
	public void testSetDataType() {
		
	}

	@Test
	public void testToString() {}

}