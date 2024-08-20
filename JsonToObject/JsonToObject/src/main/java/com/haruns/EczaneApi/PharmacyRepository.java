package com.haruns.EczaneApi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

import java.util.ArrayList;
import java.util.List;


public class PharmacyRepository {
	
	public static List<Pharmacy> getPharmacies(String il, String ilce) {
		List<Pharmacy> pharmacies = new ArrayList<>();
		String jsonData = "";
		
		try {
			
			HttpResponse<String> response = Unirest.get("https://api.collectapi.com/health/dutyPharmacy?ilce="+ilce+
					                                            "&il="+il)
			                                       .header("content-type", "application/json")
			                                       .header("authorization", "apikey 0r9fTs6GW4g3VNWauATPgt:3gqlulbEmpjZCZtM4DzURP")
			                                       .asString();
			
			// Yanıt verisini JSON string olarak alıyoruz
			jsonData = response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Gson ile JSON verisini parse ediyoruz
		Gson gson = new Gson();
		JsonElement jsonElement = JsonParser.parseString(jsonData);
		
		// JSON verisinde "result" adlı diziye ulaşıyoruz
		JsonObject asJsonObject = jsonElement.getAsJsonObject();
		JsonArray resultsJsonArray = asJsonObject.get("result").getAsJsonArray();
		
		for (int i = 0; i < resultsJsonArray.size(); i++) {
			JsonObject pharmacyJsonObject = resultsJsonArray.get(i).getAsJsonObject();
			
			// JsonObject'i DutyPharmacy sınıfına dönüştürüyoruz
			Pharmacy pharmacy = gson.fromJson(pharmacyJsonObject, Pharmacy.class);
			pharmacies.add(pharmacy);
		}
		
		return pharmacies;
	}
}