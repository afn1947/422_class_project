import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeConvertCreateDDLTest {

    private CreateDDLMySQL testObj;

    @Before
    public void setUp() throws Exception {
        EdgeTable table1 = new EdgeTable("1|TEST1");
        EdgeField field1 = new EdgeField("1|TEST_FIELD1");
        EdgeField field2 = new EdgeField("2|TEST_FIELD2");
        table1.setRelatedField(0,1);
        EdgeTable[] tables = new EdgeTable[]{table1};
        EdgeField[] fields = new EdgeField[]{field1, field2};
        testObj = new CreateDDLMySQL(tables, fields);
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