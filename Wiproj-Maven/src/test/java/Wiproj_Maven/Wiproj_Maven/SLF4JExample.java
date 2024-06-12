package Wiproj_Maven.Wiproj_Maven;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {
	private static final Logger logger = LoggerFactory.getLogger(SLF4JExample.class);
	public static void main(String args[])
	{
		logger.info("This is an infor message");
		logger.debug("This is the debug message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		BasicConfigurator.configure();
		/*
		 * logger.info("Hello world"); logger.info("We are in logger info mode");
		 * logger.warn("We are getting warning message");
		 */
		
		try
		{
			logger.info("Planning to Divide the number by some number");
			int result = divide(10,3);
			logger.warn("This is a warn message...");
			
		}
		catch(Exception e)
		{
			logger.error("Exception occurred: "+e);			
		}	
		
	}
	
	private static int divide(int a, int b)
	{
		return a/b;
	}

}
