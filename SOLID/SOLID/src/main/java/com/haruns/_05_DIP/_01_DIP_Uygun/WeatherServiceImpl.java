package com.haruns._05_DIP._01_DIP_Uygun;

public class WeatherServiceImpl implements IWeatherService{
	@Override
	public String getWeather() {
		return "Sunny";
	}
}