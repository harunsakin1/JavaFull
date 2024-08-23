package com.haruns._05_DIP._01_DIP_Aykiri;

import com.haruns._05_DIP._01_DIP_Uygun.IWeatherService;

public class WeatherClient{
	private IWeatherService weatherService;
	
	public WeatherClient(IWeatherService weatherService) {
		this.weatherService = weatherService;
	}
	public void displayWeather(){
		String weather=weatherService.getWeather();
		System.out.println("Şuanki hava durumu : "+weather);
	}
}