package com.haruns.UserApi;

import com.google.gson.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRepository {
	/*public List<User> getUsers(int count){
		List<User> users=new ArrayList<>();
		Scanner sc;
		String jsonData="";
		try {
			sc=new Scanner(new URL("https://randomuser.me/api/?results="+count).openStream());
			//System.out.println(sc.nextLine());
			jsonData = sc.nextLine();
			//System.out.println("jsonData .......: "+jsonData);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Gson gson=new Gson();
		JsonElement jsonElement = JsonParser.parseString(jsonData);
		//System.out.println("JSON Element : ........ : "+jsonElement);
		//System.out.println("---------------------------------");
		
		 *//*Json element içinde { ile başladığı için bir JsonObject olduğunu biliyoruz. Bu yüzden içindeki
		 JsonObject'i almak için getAsJsonObect metodunu kullanıyoruz.*//*
		JsonObject asJsonObject = jsonElement.getAsJsonObject();
		
		*//*JsonObject içinde bizi ilgilendiren user dataları results kısmında olduğu için get içine results yazıyoruz.
		Ardından results kısmında [ ile başladığı için bir JsonArray olduğunu biliyoruz. Bu yüzden içindeki
		JsonArray'i almak için getAsJsonArray metodunu kullanıyoruz.*//*
		
		JsonArray resultsJsonArray = asJsonObject.get("results").getAsJsonArray();
		//System.out.println("resultsJsonArray...........: "+resultsJsonArray);
		//System.out.println("---------------------------------");
		for (int i = 0; i < resultsJsonArray.size(); i++) {
			JsonObject userJsonObject = resultsJsonArray.get(i).getAsJsonObject();
			//System.out.println("userJsonObject.......... : "+userJsonObject);
			//System.out.println("---------------------------------");
			
			User user = gson.fromJson(userJsonObject, User.class);// Parametrede Class<T> classOfT şeklinde bir yapı varsa
		// vereceğimiz sınıfın sonuna .class eklemeliyiz.
		//System.out.println("user......... : "+user);
			users.add(user);
		}
		return users;
	}*/
	public List<User> getUsers(int count) {
		List<User> users = new ArrayList<>();
		Scanner sc;
		String jsonData = "";
		try {
			sc = new Scanner(new URL("https://randomuser.me/api/?results=" + count).openStream());
			jsonData = sc.nextLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();
		JsonElement jsonElement = JsonParser.parseString(jsonData);
		JsonObject asJsonObject = jsonElement.getAsJsonObject();
		JsonArray resultsJsonArray = asJsonObject.get("results").getAsJsonArray();
		for (int i = 0; i < resultsJsonArray.size(); i++) {
			JsonObject userJsonObject = resultsJsonArray.get(i).getAsJsonObject();
			User user = gson.fromJson(userJsonObject, User.class);
			users.add(user);
		}
		return users;
	}
	
}