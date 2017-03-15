package com.itprotopics.wsclients;

import net.webservicex.TemperatureUnit;

public interface ConvertTemperatureClient {

	Double convert(TemperatureUnit fromUnit, TemperatureUnit toUnit, Double value);
	
}
