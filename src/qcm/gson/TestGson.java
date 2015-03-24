package qcm.gson;

import qcm.models.Connexion;
import qcm.models.User;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestGson {
	private Gson gson;
	
	public TestGson(){
		GsonBuilder builder=new GsonBuilder();
		builder.setDateFormat("yyyy-MM-dd");
		gson=builder.create();
	}
	
	public String objectToJson(Object object){
		return gson.toJson(object);
	}
	
	public User jsonToUser(String jsonString){
		return gson.fromJson(jsonString, User.class);
	}
	
	public Connexion jsonToConnect(String jsonString){
		return gson.fromJson(jsonString, Connexion.class);
	}
	
	
	public static void main(String args[]){
		TestGson test=new TestGson();
		User user=new User();
		user.setMail("alut@sf.fr");
		user.setName("John");
		String str=test.objectToJson(user);
		System.out.println(str);
		
		String json="{id:5,name:'jim',dateCreation:'2015-03-17'}";
		User user2=test.jsonToUser(json);
		System.out.println(user2);
	}
}
