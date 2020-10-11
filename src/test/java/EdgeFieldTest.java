import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* EdgeFieldTest is a class for making sure that an EdgeField is
* created correctly. It tests for empty string, negative, and 0 values.
* @author Anna Jacobsen
* @version 10//11/2020
*/

public class EdgeFieldTest {
	private EdgeField testField;
	private EdgeField testField2;
	private EdgeField testField3;
	private EdgeField testField4;

	@Before
	public void setUp() throws Exception {
		testField = new EdgeField("2|testName");
		testField2 =  new EdgeField("0|testName");
		testField3 = new EdgeField("-1|testName");
		testField4 = new EdgeField("2| ");
	}

	@Test
	public void testGetNumFigure(){
		assertEquals("Test 1: numFigure was intialized to 2", 2,testField.getNumFigure());
		assertEquals("Test 2: numFigure was intialized to 0", 0,testField2.getNumFigure());
		assertEquals("Test 3: numFigure was intialized to -1", -1,testField3.getNumFigure());
		assertEquals("Test 4: numFigure was intialized to 2", 2,testField4.getNumFigure());
	}

	@Test
	public void testGetName(){
		assertEquals("Test 1: name was intialized to testName", "testName" ,testField.getName());
		assertEquals("Test 2: name was intialized to testName", "testName" ,testField2.getName());
		assertEquals("Test 3: name was intialized to testName", "testName" ,testField3.getName());
		assertEquals("Test 4: name was intialized to an empty string", "" ,testField4.getName());
	}

	@Test
	public void testGetTableID() {
		assertEquals("Test 1: tableID should be 0", 0, testField.getTableID());
		assertEquals("Test 1: tableID should be 0", 0, testField2.getTableID());
		assertEquals("Test 1: tableID should be 0", 0, testField3.getTableID());
		assertEquals("Test 1: tableID should be 0", 0, testField4.getTableID());
	
	}

	@Test
	public void testSetTableID() {}

	@Test
	public void testGetTableBound() {
		assertEquals("Test 1: tableBound should be 0", 0, testField.getTableBound());
		assertEquals("Test 2: tableBound should be 0", 0, testField2.getTableBound());
		assertEquals("Test 3: tableBound should be 0", 0, testField3.getTableBound());
		assertEquals("Test 4: tableBound should be 0", 0, testField4.getTableBound());
	}

	@Test
	public void testSetTableBound() {}

	@Test
	public void testGetFileBound() {
		assertEquals("Test 1: fileBound should be 0", 0, testField.getFileBound());
		assertEquals("Test 2: fileBound should be 0", 0, testField2.getFileBound());
		assertEquals("Test 3: fileBound should be 0", 0, testField3.getFileBound());
		assertEquals("Test 4: fileBound should be 0", 0, testField4.getFileBound());
	}

	@Test
	public void testSetFileBound() {}

	@Test
	public void testGetDisallowNull() {
		assertEquals("Test: disallowNull should be false", false, testField.getDisallowNull());
	}

	@Test
	public void testSetDisallowNull() {}

	@Test
	public void testGetIsPrimaryKey() {
		assertEquals("Test: isPrimaryKey should be false", false, testField.getIsPrimaryKey());
	}

	@Test
	public void testSetIsPrimaryKey() {}

	@Test
	public void testGetDefaultValue() {
		assertEquals("Test: defaultValue should be an empty String", "", testField.getDefaultValue());
	}

	@Test
	public void testSetDefaultValue() {}

	@Test
	public void testGetVarCharValue() {
		assertEquals("Test: varCharValue should be VARCHAR_DEFAULT_LENGTH", VARCHAR_DEFAULT_LENGTH, testField.getVarcharValue());
	}

	@Test
	public void testSetVarCharValue() {}

	@Test
	public void testGetDataType() {
		assertEquals("Test: dataType should be 0", 0, testField.getDataType());
	}

	@Test
	public void testSetDataType() {
		
	}

	@Test
	public void testToString() {}

}