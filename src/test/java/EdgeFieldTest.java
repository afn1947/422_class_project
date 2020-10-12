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
	* Does the toString method return the expected output?
	*/
	@Test
	public void testToString() {
		/*numFigure + EdgeConvertFileParser.DELIM +
      name + EdgeConvertFileParser.DELIM +
      tableID + EdgeConvertFileParser.DELIM +
      tableBound + EdgeConvertFileParser.DELIM +
      fieldBound + EdgeConvertFileParser.DELIM +
      dataType + EdgeConvertFileParser.DELIM +
      varcharValue + EdgeConvertFileParser.DELIM +
      isPrimaryKey + EdgeConvertFileParser.DELIM +
      disallowNull + EdgeConvertFileParser.DELIM +
      defaultValue;*/

			assertEquals("Test: toString...",
			"2|testName|0|0|0|0|1|false|false|\"\"",
			testField.toString());
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

	/**
	* Is the correct field boundary returned?
	*/
	@Test
	public void testGetFieldBound() {
		assertEquals("Test: fileBound should be 0", 0, testField.getFieldBound());
	}

	/**
	* Can you set the field boundary? 
	* Can you set the field boundary to zero?
	* Can you set the field boundary to a negative number?
	*/
	@Test
	public void testSetFieldBound() {
		testField.setFieldBound(1);
		assertEquals("Test 1: tableBound should be set to 1.",1,testField.getFieldBound());

		testField.setFieldBound(-1);
		assertEquals("Test 2: tableBound should not allow a negative number. Attempted to set tableBound to -1.",-1,testField.getFieldBound());

		testField.setFieldBound(0);
		assertEquals("Test 3: tableBound should not allow a zero value. Attempted to set tableBound to 0.",0,testField.getFieldBound());
	}

	/**
	* Is the correct value for disallowNull returned?
	*/
	@Test
	public void testGetDisallowNull() {
		assertEquals("Test: disallowNull should be false", false, testField.getDisallowNull());
	}

	/**
	* Can you set the disallowNull property?
	*/
	@Test
	public void testSetDisallowNull() {
		testField.setDisallowNull(true);
		assertEquals("Test: disallowNull should be set to true",true,testField.getDisallowNull());
	}

	/**
	* Is the correct value for isPrimaryKey returned?
	*/
	@Test
	public void testGetIsPrimaryKey() {
		assertEquals("Test: isPrimaryKey should be false", false, testField.getIsPrimaryKey());
	}

	/**
	* Can you set the isPrimaryKey property?
	*/
	@Test
	public void testSetIsPrimaryKey() {
		testField.setIsPrimaryKey(true);
		assertEquals("Test: isPrimaryKey should be set to true",true,testField.getIsPrimaryKey());
	}

	/**
	* Is the correct defaultValue returned?
	*/
	@Test
	public void testGetDefaultValue() {
		assertEquals("Test: defaultValue should be an empty String", "", testField.getDefaultValue());
	}

	/**
	* Can you set the default value of the field to a String?
	* Can you set the default value of the field to an empty String?
	*/
	@Test
	public void testSetDefaultValue() {
		testField.setDefaultValue("New Field Value");
		assertEquals("Test 1: defaultValue should now be \"New Field Value\" ","New Field Value",testField.getDefaultValue());

		testField.setDefaultValue("");
		assertEquals("Test 2: defaultValue should now be \"\" ","",testField.getDefaultValue());
	}

	/**
	* Is the correct varcharValue returned?
	*/
	@Test
	public void testGetVarCharValue() {
		assertEquals("Test: varCharValue should be 1", 1, testField.getVarcharValue());
	}

	/**
	* Can you set the varCharValue? 
	* Can you set the varCharValue to zero?
	* Can you set the varCharValue to a negative number?
	*/
	@Test
	public void testSetVarCharValue() {
		testField.setVarcharValue(1);
		assertEquals("Test 1: varcharValue should be set to 1.",1,testField.getVarcharValue());

		testField.setVarcharValue(-1);
		assertEquals("Test 2: varcharValue should not allow a negative number. Attempted to set tableBound to -1.",-1,testField.getVarcharValue());

		testField.setVarcharValue(0);
		assertEquals("Test 3: varcharValue should not allow a zero value. Attempted to set tableBound to 0.",0,testField.getVarcharValue());
	}

	/**
	* Is the correct dataType returned?
	*/
	@Test
	public void testGetDataType() {
		assertEquals("Test: dataType should be 0", 0, testField.getDataType());
	}

	/**
	* Can you set the dataType? 
	* Can you set the dataType to a negative number?
	* Can you set the dataType to a number greater than the length of the strDataType array? (3)
	*/
	@Test
	public void testSetDataType() {
		testField.setDataType(1);
		assertEquals("Test 1: dataType should be set to 1.",1,testField.getDataType());

		testField.setDataType(-1);
		assertEquals("Test 2: dataType should not allow a negative number. Attempted to set dataType to -1.",-1,testField.getDataType());

		testField.setDataType(1000);
		assertEquals("Test 3: dataType should not allow a value > 3. Attempted to set dataType to 1000.",1000,testField.getDataType());
	}
}