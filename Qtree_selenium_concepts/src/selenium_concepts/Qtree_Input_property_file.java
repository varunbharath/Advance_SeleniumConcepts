package selenium_concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Qtree_Input_property_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("C:\\Users\\kumar\\git\\seleniumurl\\Qtree_selenium_concepts\\Input.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
	}

}
