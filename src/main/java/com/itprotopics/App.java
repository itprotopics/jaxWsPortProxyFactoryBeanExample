package com.itprotopics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.webservicex.ConvertTemperatureSoap;
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
    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config/application-context.xml");
    	
    	ConvertTemperatureSoap convertTemperature = null;
    	

    	convertTemperature = (ConvertTemperatureSoap) context.getBean("convertTemperature");
		
    	retValue =  convertTemperature.convertTemp(30.4, TemperatureUnit.DEGREE_CELSIUS, TemperatureUnit.DEGREE_FAHRENHEIT);
    	
    
    	System.out.println("RetVal = " + retValue );
    	
    }
}
