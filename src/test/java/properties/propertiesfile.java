package properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class propertiesfile {

	public static void main(String[] args) throws FileNotFoundException {
		
		Properties properties = new Properties();
		String filepath = System.getProperty("user.dir")+"\\data\\propertiesfile.properties";
		FileInputStream file= new FileInputStream(filepath);
		
		try {
			properties.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String user =properties.getProperty("userid");
		System.out.println(user);
		
	}
	
}
