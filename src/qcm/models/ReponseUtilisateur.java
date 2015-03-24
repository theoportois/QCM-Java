package qcm.models;

public class ReponseUtilisateur {
	private int reponse_id;
	private int realisation_id;
	public ReponseUtilisateur() {
		super();
	}
	public int getReponse_id() {
		return reponse_id;
	}
	public void setReponse_id(int reponse_id) {
		this.reponse_id = reponse_id;
	}
	public int getRealisation_id() {
		return realisation_id;
	}
	public void setRealisation_id(int realisation_id) {
		this.realisation_id = realisation_id;
	}
	@Override
	public String toString() {
		return "ReponseUtilisateur [reponse_id=" + reponse_id + ", realisation_id=" + realisation_id + "]";
	}
	
}
