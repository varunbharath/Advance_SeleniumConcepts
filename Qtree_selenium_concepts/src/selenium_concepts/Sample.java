package selenium_concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File a=new File("");
		FileInputStream fis= new FileInputStream(a);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Password"));
	}
	

}
