package TestNGDemos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesDemo {
	
	@Test
	public void read() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:/Users/Hp/eclipse-workspace/Wiproj-Maven/src/test/java/TestNGDemos/data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));
		//set value
		prop.setProperty("url", "https://www.google.com");
		FileOutputStream fos = new FileOutputStream("D:/Users/Hp/eclipse-workspace/Wiproj-Maven/src/test/java/TestNGDemos/data.properties");
		prop.store(fos, "Test Data");
		fos.close();
		System.out.println(prop.size());
		System.out.println(prop.getProperty("url"));
	}

}
