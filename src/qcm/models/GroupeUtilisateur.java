package qcm.models;

public class GroupeUtilisateur {
	private int groupe_id;
	private int utilisateur_id;
	public int getGroupe_id() {
		return groupe_id;
	}
	public void setGroupe_id(int groupe_id) {
		this.groupe_id = groupe_id;
	}
	public int getUtilisateur_id() {
		return utilisateur_id;
	}
	public void setUtilisateur_id(int utilisateur_id) {
		this.utilisateur_id = utilisateur_id;
	}
	@Override
	public String toString() {
		return "GroupeUtilisateur [groupe_id=" + groupe_id + ", utilisateur_id=" + utilisateur_id + "]";
	}
	public GroupeUtilisateur() {
		super();
	}
	
}
