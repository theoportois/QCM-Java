package qcm.models;

import java.util.Date;

public class Questionnaire {
	private Integer id;
	private String libelle;
	private int domaine_id;
	private Date date;
	private int groupe_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getDomaine_id() {
		return domaine_id;
	}
	public void setDomaine_id(int domaine_id) {
		this.domaine_id = domaine_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getGroupe_id() {
		return groupe_id;
	}
	public void setGroupe_id(int groupe_id) {
		this.groupe_id = groupe_id;
	}
	@Override
	public String toString() {
		return "Questionnaire [id=" + id + ", libelle=" + libelle + ", domaine_id=" + domaine_id + ", date=" + date
				+ ", groupe_id=" + groupe_id + "]";
	}
	
	
}
