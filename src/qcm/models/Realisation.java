package qcm.models;

import java.util.Date;

public class Realisation {
	private Integer id;
	private int utilisateur_id;
	private int questionnaire_id;
	private int score;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getUtilisateur_id() {
		return utilisateur_id;
	}
	public void setUtilisateur_id(int utilisateur_id) {
		this.utilisateur_id = utilisateur_id;
	}
	public int getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(int questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Realisation [id=" + id + ", utilisateur_id=" + utilisateur_id + ", questionnaire_id="
				+ questionnaire_id + ", score=" + score + ", date=" + date + "]";
	}
	public Realisation() {
		super();
	}
	
}
