package qcm.models;

public class Connexion {
	private String token;
	private Boolean connected;
	public Connexion() {
		super();
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Boolean getConnected() {
		return connected;
	}
	public void setConnected(Boolean connected) {
		this.connected = connected;
	}
	@Override
	public String toString() {
		return "Connexion [token=" + token + ", connected=" + connected + "]";
	}
	
}
