package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DetailsFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		 FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");

	        Properties pobj = new Properties();

	        pobj.load(fis);
	        
	         String BROWSER  = pobj.getProperty("BROWSER");
	         String URL      = pobj.getProperty("URL");
	         String USERNAME = pobj.getProperty("USERNAME");
	         String PASSWORD = pobj.getProperty("PASSWORD");
	         
	         System.out.println(BROWSER);
	         System.out.println(URL);
	         System.out.println(USERNAME);
	         System.out.println(PASSWORD);

	         

	      
	    }
	}

