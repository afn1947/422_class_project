import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
* Abstract class EdgeFileParser contains methods that are shared by children, abstract methods that must be implemented
* by its children, and variables that can be accessed by both children.
*/
public abstract class EdgeFileParser {
	//declare fields -- protected can be accessed by children.
	protected static final Logger logger = LogManager.getLogger(EdgeConvertFileParser.class);
	protected static final String DELIM = "|";
	protected ArrayList alTables = new ArrayList(),
											alFields = new ArrayList(), 
											alConnectors = new ArrayList();
	protected EdgeConnector[] connectors; 
  protected EdgeTable[] tables;
  protected EdgeField[] fields;
	protected File inputFile;

	public EdgeFileParser(){}

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

	/*----------- declare the abstract methods to be implemented in child classes. ----------- */
	abstract boolean openFile(File inputFile);

	abstract void parseFile();

}