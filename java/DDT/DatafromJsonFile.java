package DDT;
import java.io.FileReader;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DatafromJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		
    FileReader Fr =  new FileReader("./src/test/resources/commondata.json");
    
     JSONParser 	parser =  new JSONParser();
     Object obj = parser.parse(Fr);
    
	JSONObject jobj = (JSONObject) obj;	
	
	 String BROWSER =  jobj.get("bro").toString();
	 String URL = jobj.get("url").toString();
	 String USERNAME = jobj.get("un").toString();
	 String PASSWORD = jobj.get("pwd").toString();
	 
	 
	 System.out.println(BROWSER);
	 System.out.println(URL);
	 System.out.println(USERNAME);
	 System.out.println(PASSWORD);

	 
	 
	 
    
	}
}
