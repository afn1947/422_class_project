import java.io.*;
import java.util.*;
import javax.swing.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

// Milestone 4 Refactored Code
public class ParseSaveFile extends FileParser {

	public static final String FILE_ID = "EdgeConvert Save File";
	private BufferedReader br;
	
	public ParseSaveFile(File constructorFile){
		super.inputFile = constructorFile;
	}

	public boolean openFile(File inputFile) {
      try {
         logger.info("Attempting to open file...");
         FileReader fr = new FileReader(inputFile);
         br = new BufferedReader(fr);
         //test for what kind of file we have
         String currentLine = br.readLine().trim();
        if (currentLine.startsWith(FILE_ID)) { //the file chosen is a Save file created by this application
            this.parseFile(); //parse the file
            br.close();
            this.makeArrays(); //convert ArrayList objects into arrays of the appropriate Class type
						return true;
        } else { //the file chosen is something else
            JOptionPane.showMessageDialog(null, "Unrecognized file format");
						logger.debug("The file was an unrecognized format");
						return false;
        } // End of if-else
      } // try
      catch (FileNotFoundException fnfe) {
         logger.error("Cannot find \"" + inputFile.getName() + "\".");
         System.out.println("Cannot find \"" + inputFile.getName() + "\".");
         System.exit(0);
				 return false;
      } // catch FileNotFoundException
      catch (IOException ioe) {
         logger.error("There was an IO Exception.");
         System.out.println(ioe);
         System.exit(0);
				 return false;
      } // catch IOException
   } // openFile()

	public void parseFile() { //this method is unclear and confusing in places
				StringTokenizer stTables, stNatFields, stRelFields, stNatRelFields, stField;
				String fieldName = "";
				EdgeTable tempTable;
				int numFields = 0, numTables = 0, numFigure = 0;
				try{
						String currentLine = br.readLine();
						currentLine = br.readLine(); //this should be "Table: "
						EdgeField tempField = new EdgeField(numFigure + DELIM + fieldName);
						while (currentLine.startsWith("Table: ")) {
							numFigure = Integer.parseInt(currentLine.substring(currentLine.indexOf(" ") + 1)); //get the Table number
							currentLine = br.readLine(); //this should be "{"
							currentLine = br.readLine(); //this should be "TableName"
							String tableName = currentLine.substring(currentLine.indexOf(" ") + 1);
							tempTable = new EdgeTable(numFigure + DELIM + tableName);
							
							currentLine = br.readLine(); //this should be the NativeFields list
							stNatFields = new StringTokenizer(currentLine.substring(currentLine.indexOf(" ") + 1), DELIM);
							numFields = stNatFields.countTokens();
							for (int i = 0; i < numFields; i++) {
									tempTable.addNativeField(Integer.parseInt(stNatFields.nextToken()));
							}
						
							currentLine = br.readLine(); //this should be the RelatedTables list
							stTables = new StringTokenizer(currentLine.substring(currentLine.indexOf(" ") + 1), DELIM);
							numTables = stTables.countTokens();
							for (int i = 0; i < numTables; i++) {
									tempTable.addRelatedTable(Integer.parseInt(stTables.nextToken()));
							}
							tempTable.makeArrays();
							
							currentLine = br.readLine(); //this should be the RelatedFields list
							stRelFields = new StringTokenizer(currentLine.substring(currentLine.indexOf(" ") + 1), DELIM);
							numFields = stRelFields.countTokens();

							for (int i = 0; i < numFields; i++) {
									tempTable.setRelatedField(i, Integer.parseInt(stRelFields.nextToken()));
							}

							alTables.add(tempTable);
							currentLine = br.readLine(); //this should be "}"
							currentLine = br.readLine(); //this should be "\n"
							currentLine = br.readLine(); //this should be either the next "Table: ", #Fields#
						}
						while ((currentLine = br.readLine()) != null) {
							stField = new StringTokenizer(currentLine, DELIM);
							numFigure = Integer.parseInt(stField.nextToken());
							fieldName = stField.nextToken();
							tempField = new EdgeField(numFigure + DELIM + fieldName);
							tempField.setTableID(Integer.parseInt(stField.nextToken()));
							tempField.setTableBound(Integer.parseInt(stField.nextToken()));
							tempField.setFieldBound(Integer.parseInt(stField.nextToken()));
							tempField.setDataType(Integer.parseInt(stField.nextToken()));
							tempField.setVarcharValue(Integer.parseInt(stField.nextToken()));
							tempField.setIsPrimaryKey(Boolean.valueOf(stField.nextToken()).booleanValue());
							tempField.setDisallowNull(Boolean.valueOf(stField.nextToken()).booleanValue());
							if (stField.hasMoreTokens()) { //Default Value may not be defined
									tempField.setDefaultValue(stField.nextToken());
							}
							alFields.add(tempField);
						} // End of while loop
				}catch(IOException ioe){
					ioe.printStackTrace();
				}//End of try/catch
	} // End of parseFile
} // End of class
