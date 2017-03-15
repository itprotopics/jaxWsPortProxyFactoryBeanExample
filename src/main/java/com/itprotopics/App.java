package com.itprotopics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itprotopics.wsclients.ConvertTemperatureClient;

import net.webservicex.TemperatureUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Double retValue;
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"config/application-context.xml");

    	ConvertTemperatureClient tempClient = (ConvertTemperatureClient) context.getBean("convertTemperatureClient");
		
    	retValue = tempClient.convert(TemperatureUnit.DEGREE_CELSIUS, TemperatureUnit.DEGREE_FAHRENHEIT, 30.4);
    
    	System.out.println("RetVal = " + retValue );
    	
    }
}
