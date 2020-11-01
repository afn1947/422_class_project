import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.*;
import java.io.*;

/**
* Abstract class EdgeFileParser contains methods that are shared by children, abstract methods that must be implemented
* by its children, and variables that can be accessed by both children.
*/
public abstract class FileParser {
	//declare fields -- protected can be accessed by children.
	protected static final Logger logger = LogManager.getLogger(FileParser.class);
	protected static final String DELIM = "|";
	protected static final String SAVE_ID = "EdgeConvert Save File";
	protected static final String EDGE_ID = "EDGE Diagram File";
	protected ArrayList alTables = new ArrayList(),
											alFields = new ArrayList(), 
											alConnectors = new ArrayList();
	protected EdgeConnector[] connectors; 
  protected EdgeTable[] tables;
  protected EdgeField[] fields;
	protected File inputFile;

	public FileParser(){}

	/* ---------- declate non-abstract methods --------- */
	public void makeArrays(){
		 if (alTables != null) {
         tables = (EdgeTable[])alTables.toArray(new EdgeTable[alTables.size()]);
    	}
      if (alFields != null) {
         fields = (EdgeField[])alFields.toArray(new EdgeField[alFields.size()]);
      }
      if (alConnectors != null) {
         connectors = (EdgeConnector[])alConnectors.toArray(new EdgeConnector[alConnectors.size()]);
      }
	}

	public void resolveConnectors(){}

	public EdgeTable[] getEdgeTables() {
      return tables;
  }
   
  public EdgeField[] getEdgeFields() {
      return fields;
  }

	public static String getParserType(File inputFile){
		try{
			 logger.info("Attempting to open file...");
         FileReader fr = new FileReader(inputFile);
         BufferedReader br = new BufferedReader(fr);
         //test for what kind of file we have
         String currentLine = br.readLine().trim();
         if (currentLine.startsWith(SAVE_ID)) { //the file chosen is a Save Diagrammer file
            return "save";
         } else if (currentLine.startsWith(EDGE_ID)){
					 	return "edge";
				 }else {
						logger.debug("The file was an unrecognized format");
						return "Unrecognized file format.";
         }
		}catch(IOException ioe){
				ioe.printStackTrace();
				return "Problem with i/o.";
		}
	}//end getParserType

	/*----------- declare the abstract methods to be implemented in child classes. ----------- */
	abstract boolean openFile(File inputFile);

	abstract void parseFile();

}