package exception_passing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileOps {
	
	public void openFile(String fileName) throws FileNotFoundException {
		
		FileInputStream fs = new FileInputStream(fileName);
		
	}

}
