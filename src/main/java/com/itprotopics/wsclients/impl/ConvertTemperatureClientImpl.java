package com.itprotopics.wsclients.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.itprotopics.wsclients.ConvertTemperatureClient;

import net.webservicex.ConvertTempResponse;
import net.webservicex.ConvertTemperatureSoap;
import net.webservicex.TemperatureUnit;


public class ConvertTemperatureClientImpl implements ConvertTemperatureClient {

	@Autowired
	private ConvertTemperatureSoap convertTemperature = null;
	
	public Double convert(TemperatureUnit fromUnit, TemperatureUnit toUnit, Double value) {
		
		Double retValue;
		
		retValue =  convertTemperature.convertTemp(value, fromUnit, toUnit);
		
		return retValue;
		
	}

	public void setConvertTemperature(ConvertTemperatureSoap convertTemperature) {
		this.convertTemperature = convertTemperature;
	}

	
		
}
