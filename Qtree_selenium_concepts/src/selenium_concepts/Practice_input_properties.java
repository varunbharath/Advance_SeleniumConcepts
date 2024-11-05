package selenium_concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Practice_input_properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 File f= new File("C:\\Users\\kumar\\git\\seleniumurl\\Qtree_selenium_concepts\\src\\selenium_concepts\\Uploadclass_using_sendkeys.java");
		 FileInputStream fis= new FileInputStream(f);
		 Properties prop=new Properties();
		 
			prop.load(fis);
			System.out.println(prop.getProperty("name"));
	}

}
