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

	/**
	* Can you intialize testName to an empty string?
	* Can you initialize numFigure to zero or a negative number?
	*/
	@Before
	public void setUp() throws Exception {
		testField = new EdgeField("2|testName");
		testField2 =  new EdgeField("0|testName");
		testField3 = new EdgeField("-1|testName");
		testField4 = new EdgeField("2| ");
	}

	/**
	* Is the numFigure value returned correct? 
	*/
	@Test
	public void testGetNumFigure(){
		assertEquals("Test 1: numFigure should be 2", 2,testField.getNumFigure());
		assertEquals("Test 2: numFigure should be 0", 0,testField2.getNumFigure());
		assertEquals("Test 3: numFigure should be -1", -1,testField3.getNumFigure());
		assertEquals("Test 4: numFigure should be 2", 2,testField4.getNumFigure());
	}

	/**
	* Is the correct name returned?
	*/
	@Test
	public void testGetName(){
		assertEquals("Test 1: name should be testName", "testName" ,testField.getName());
		assertEquals("Test 2: name should be testName", "testName" ,testField2.getName());
		assertEquals("Test 3: name should be testName", "testName" ,testField3.getName());
		assertEquals("Test 4: name should be an empty string", "" ,testField4.getName());
	}

	/**
	* Is the correct tableID returned?
	*/
	@Test
	public void testGetTableID() {
		assertEquals("Test: tableID should be 0", 0, testField.getTableID());
	}

	/**
	* Can you set the table ID? 
	* Can you set the table ID to zero?
	* Can you set the table ID to a negative number?
	*/
	@Test
	public void testSetTableID() {
		testField.setTableID(1);
		assertEquals("tableID should be set to 1.",1,testField.getTableID());
		testField.setTableID(-1);
		assertEquals("tableID should not allow a negative number. Attempted to set ID to -1.",-1,testField.getTableID());
		testField.setTableID(0);
		assertEquals("tableID should not allow a zero value. Attempted to set ID to 0.",0,testField.getTableID());
	}

	/**
	* Is the correct tableBound returned?
	*/
	@Test
	public void testGetTableBound() {
		assertEquals("Test: tableBound should be 0", 0, testField.getTableBound());
	}


	/**
	* Can you set the table boundary? 
	* Can you set the table boundary to zero?
	* Can you set the table boundary to a negative number?
	*/
	@Test
	public void testSetTableBound() {
		testField.setTableBound(1);
		assertEquals("tableBound should be set to 1.",1,testField.getTableBound());
		testField.setTableBound(-1);
		assertEquals("tableBound should not allow a negative number. Attempted to set tableBound to -1.",-1,testField.getTableBound());
		testField.setTableBound(0);
		assertEquals("tableBound should not allow a zero value. Attempted to set tableBound to 0.",0,testField.getTableBound());
	}

	@Test
	public void testGetFileBound() {
		assertEquals("Test: fileBound should be 0", 0, testField.getFileBound());
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