import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.io.File;

/*import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;*/

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class EdgeConvertFileParserTest {
	ParseSaveFile saveFileTestObj;
	ParseEdgeFile edgeFileTestObj;

	@Before
	public void setUp() throws Exception {
		File file = new File("Courses.edg");
		saveFileTestObj = new ParseSaveFile(file);
		edgeFileTestObj = new ParseEdgeFile(file);
	}

	@Test
	public void testResolveConnectors(){
		edgeFileTestObj.resolveConnectors();
		assertTrue("Connectors should be resolved", edgeFileTestObj.connectorsResolved);
	}

	@Test
	public void testMakeArrays(){
		edgeFileTestObj.makeArrays();
		assertNotNull("Tables should not be null",edgeFileTestObj.getEdgeTables());
		assertNotNull("Fields should not be null",edgeFileTestObj.getEdgeFields());
	}

	@Test
	public void testIsTableDup(){
		assertTrue("isTableDup should be true", edgeFileTestObj.isTableDup("FigureButtons"));
		assertFalse("isTableDup should be false", edgeFileTestObj.isTableDup("foo"));
	}

	@Test
	public void testGetEdgeTables(){
		assertNotNull("Tables should not be null",edgeFileTestObj.getEdgeTables());
	}

	@Test
	public void testGetEdgeFields(){
		assertNotNull("Fields should not be null",edgeFileTestObj.getEdgeFields());
	}

	@Test
	public void testOpenFile(){
		File file = new File("Courses.edg");
		assertTrue("openFile should return true if file was opened.", saveFileTestObj.openFile(file));
	}
}