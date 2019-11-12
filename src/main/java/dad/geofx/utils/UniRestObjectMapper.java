package dad.geofx.utils;

import com.mashape.unirest.http.ObjectMapper;
import com.google.gson.Gson;

public class UniRestObjectMapper implements ObjectMapper {

	private Gson gson = new Gson();
	
	@Override
	public <T> T readValue(String value, Class<T> valueType) {
		try{
			return gson.fromJson(value, valueType);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public String writeValue(Object value) {
		try{
			return gson.toJson(value);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
