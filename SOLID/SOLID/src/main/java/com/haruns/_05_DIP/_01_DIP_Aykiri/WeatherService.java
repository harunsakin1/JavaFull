package com.haruns._05_DIP._01_DIP_Aykiri;

import com.haruns._05_DIP._01_DIP_Uygun.IWeatherService;

public class WeatherService implements IWeatherService {
	public String getWeather(){
		return "Sunny";
	}
}