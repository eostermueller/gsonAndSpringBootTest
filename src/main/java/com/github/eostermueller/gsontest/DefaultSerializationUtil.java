package com.github.eostermueller.gsontest;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

/**
 * Why I chose gson:
 * "If your environment primarily deals with lots of small JSON requests, 
 * such as in a micro services or distributed architecture setup, then GSON is your library of interest. 
 * Jackson struggles the most with small files."
 * 
 * the above is take from here:
 * 	https://blog.overops.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/
 * @author erikostermueller
 *
 */
public class DefaultSerializationUtil  {

	private Gson getGson() {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		return gson;
	}
	

	public String marshalUseCases(UseCases useCases) {
		return getGson().toJson(useCases);
	}

	public UseCases unmmarshalUseCases(String json) throws HavocException {
		UseCases useCases 
		= this.getGson().fromJson(
			json,
			UseCases.class
				); 
		return useCases;
	}


	
}
