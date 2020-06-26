package exception_passing;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		
		FileOps fo = new FileOps();
		
		try {
			fo.openFile("file.txt");
			System.out.println("{ may execute }");
		} 
		catch (FileNotFoundException e) {
			System.err.println("Couldn't find the specified file!");
		}
		finally {
			System.out.println("{ will always execute }");
		}
		System.out.println("{ outer block }");
		

	}

}
