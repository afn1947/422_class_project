import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.io.File;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;

public class EdgeConvertFileParserTest {
	EdgeConvertFileParser testObj;

	@Before
	public void setUp() throws Exception {
		File file = new File("Courses.edg");
		testObj = new EdgeConvertFileParserTest(file);
	}

	@Test
	public void testParseEdgeFile(){
		assertDoesNotThrow​("Error should not be thrown",testObj.parseEdgeFile());
	}

	@Test
	public void testResolveConnectors(){
		testObj.resolveConnectors();
		assertEquals("Connectors should be resolved",true,testObj.connectorsResolved);		
	}

	@Test
	public void testParseSaveFile(){
		assertDoesNotThrow​("Error should not be thrown",testObj.parseSaveFile());
	}

	@Test
	public void testMakeArrays(){
		testObj.makeArrays();
		assertNotNull("Tables should not be null",testObj.getEdgeTables);
		assertNotNull("Fields should not be null",testObj.getEdgeFields());
	}

	@Test
	public void testIsTableDup(){
		assertEquals("isTableDup should be true",true,testObj.isTableDup("FigureButtons"));
		assertEquals("isTableDup should be false",false,testObj.isTableDup("foo"));
	}

	@Test
	public void testGetEdgeTables(){
		assertNotNull("Tables should not be null",testObj.getEdgeTables);
	}

	@Test
	public void testGetEdgeFields(){
		assertNotNull("Fields should not be null",testObj.getEdgeFields());
	}

	@Test
	public void testOpenFile(){
		File file = new File("Courses.edg");
		assertEquals("openFile should return true if file was opened.",true,testObj.openFile(file));
	}

}