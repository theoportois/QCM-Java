package qcm.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import qcm.models.Domaine;
import qcm.models.User;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class TestHttp {
	private Gson gson;
	private HttpClient httpClient;
	private HttpContext httpContext;
	private CookieStore cookieStore;
	private String baseUrl="http://127.0.0.1/rest-qcm/";

	protected void createCookieStore() {
	    httpClient = HttpClients.createDefault();
	    cookieStore = new BasicCookieStore();
	    httpContext = new BasicHttpContext();
	    httpContext.setAttribute(HttpClientContext.COOKIE_STORE, cookieStore);
	}	
	
	public String getBaseUrl() {
		return baseUrl;
	}

	public TestHttp(){
		httpClient=HttpClients.createDefault();
		createCookieStore();
		gson=new GsonBuilder().create();
	}
	
	public String get(String url, String token) throws ClientProtocolException, IOException{
		String result="";
		HttpGet getRequest = new HttpGet(url+"?token="+token);
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        result = httpClient.execute(getRequest, responseHandler,httpContext);
		return result;
	}
	
	public String delete(String url) throws ClientProtocolException, IOException{
		String result="";
		HttpDelete deleteRequest = new HttpDelete(url);
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        result = httpClient.execute(deleteRequest, responseHandler,httpContext);
		return result;
	}
	
	public String post(String url, Object object) throws ClientProtocolException, IOException{
		String result;
		HttpPost postRequest=new HttpPost(url);
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String jsonStr=gson.toJson(object);
        StringEntity entity=new StringEntity(jsonStr, "utf-8");
        postRequest.setEntity(entity);
        result=httpClient.execute(postRequest, responseHandler,httpContext);
		return result;
	}
	
	public String postJSON(String urlToRead, Object o)
	        throws ClientProtocolException, IOException {
	    String result = "";
	    CloseableHttpClient httpClient = HttpClients.createDefault();
	    try {
	        HttpPost postRequest = new HttpPost(urlToRead);
	        postRequest.setHeader("content-type","application/x-www-form-urlencoded");
	        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	         
	        JsonElement elm = gson.toJsonTree(o);
	        JsonObject jsonObj = elm.getAsJsonObject();
	        for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
	            nameValuePairs.add(new BasicNameValuePair(entry.getKey(), entry
	                    .getValue().getAsString()));
	        }
	        postRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	        ResponseHandler<String> responseHandler = new BasicResponseHandler();
	        result = httpClient.execute(postRequest, responseHandler,httpContext);
	    } finally {
	        httpClient.close();
	    }
	    return result;
	}
	
	public String put(String url, Object object) throws ClientProtocolException, IOException{
		String result;
		HttpPut putRequest=new HttpPut(url);
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String jsonStr=gson.toJson(object);
        StringEntity entity=new StringEntity(jsonStr, "utf-8");
        putRequest.setEntity(entity);
        result=httpClient.execute(putRequest, responseHandler,httpContext);
		return result;
	}
	
	
	
}
