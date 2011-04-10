package madcow.magic.importer.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import madcow.magic.database.core.DatabasePackage;
import madcow.magic.database.set.Block;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;

public class CSVFileReader {

	String fileName;
	String folderName;
	List<String> lines = new ArrayList<String>();
	//EList<EList<String>> values = ECollections.emptyEList();
	EList<EList<String>> values = new BasicEList<EList<String>>();

	public CSVFileReader(String FileName) {
		this.fileName = FileName;
	}

	public void readFile() {
		try {
			// storeValues.clear();//just in case this is the second call of the
			// ReadFile Method./
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber = 0;
			String currentLine;

			while ((currentLine = br.readLine()) != null) {
				lineNumber++;
				//System.out.println(currentLine);
				lines.add(currentLine);
				// break comma separated line using ","
				st = new StringTokenizer(currentLine, ";");

				EList<String> lineValues = null;
				tokenNumber = st.countTokens();
				if (0 < tokenNumber) {
					//lineValues = ECollections.emptyEList();
					lineValues = new BasicEList<String>();
					values.add(lineValues);
					//System.out.println("Line # " + lineNumber + ", Token # "
					//		+ tokenNumber);

					while (st.hasMoreTokens()) {
						String value = st.nextToken();
						lineValues.add(value);
						//System.out.print(value + "; ");
					}
					
					//System.out.println(" > " + lineValues.toString());
				}
				// reset token number
				tokenNumber = 0;

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void readFolder(){
		
		File folder = new File(folderName);
		
		if(!folder.isDirectory()){
			return;
		}
		for(File f : folder.listFiles()){
			fileName = f.getPath();
			readFile();
		}
	}

	// mutators and accesors
	public void setFileName(String newFileName) {
		this.fileName = newFileName;
	}
	
	public void setFolderName(String newFolderName) {
		this.folderName = newFolderName;
	}

	public String getFileName() {
		return fileName;
	}

	public List<String> getLines() {
		return this.lines;
	}

	public EList<EList<String>> getValues() {
		return this.values;
	}
	
	public void displayLineList() {
		for (int x = 0; x < this.lines.size(); x++) {
			System.out.println(lines.get(x));
		}
	}

}