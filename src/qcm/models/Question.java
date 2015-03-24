package qcm.models;

public class Question {
	private Integer id;
	private String libelle;
	private int questionnaire_id;
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
	public int getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(int questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", libelle=" + libelle + ", questionnaire_id=" + questionnaire_id + "]";
	}
	
	
	
}
