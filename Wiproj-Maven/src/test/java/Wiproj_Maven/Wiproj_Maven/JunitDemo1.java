package Wiproj_Maven.Wiproj_Maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitDemo1 {
	
	String message = "Robert";	
	   String name="Anand";
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside Test Annotation");    
	      assertEquals("anand", name);     
	   }

}
