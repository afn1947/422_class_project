import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeConvertCreateDDLTest {

    //private EdgeConvertCreateDDLTest testObj;
    private EdgeTable table1;
    private EdgeTable table2;
    private EdgeField field1;
    private EdgeField field2;
    private EdgeField field3;
    private EdgeTable[] tables;
    private EdgeField[] fields;
    private CreateDDLMySQL testObj;

    // field  3|Grade|13|0|0|0|1|false|false|
    // table Table: 1
    //{
    //TableName: STUDENT
    //NativeFields: 7|8
    //RelatedTables:
    //RelatedFields: 0|0
    //}
    @Before
    public void setUp() throws Exception {
        table1 = new EdgeTable("1|TEST1");
//        table2 = new EdgeTable("2|TEST_TABLE2");
        field1 = new EdgeField("1|TEST_FIELD1");
        field2 = new EdgeField("2|TEST_FIELD2");
        table1.setRelatedField(0,1);

        tables = new EdgeTable[]{table1};
        fields = new EdgeField[]{field1, field2};
        testObj = new CreateDDLMySQL(tables,fields);


        //testObj = new CreateDDLMySQL("EdgeConvertFileParserTest");
    }

    @Test(expected = Exception.class)
    public void testInitialize() {
        String expected = "";
        assertEquals(new CreateDDLMySQL(null,null),expected);
    }


    @Test
    public void testGetTable() {
        assertEquals("Table should be TEST1", "TEST1", testObj.getTable(1).getName());
    }

    @Test
    public void testGetField() {
        assertEquals("Field should be TEST_FIELD1", "TEST_FIELD1", testObj.getField(1).getName());
    }
}