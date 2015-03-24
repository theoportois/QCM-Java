package qcm.models;

public class GroupeQuestionnaire {
	private int groupe_id;
	private int questionnaire_id;
	public int getGroupe_id() {
		return groupe_id;
	}
	public void setGroupe_id(int groupe_id) {
		this.groupe_id = groupe_id;
	}
	public int getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(int questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	public GroupeQuestionnaire() {
		super();
	}
	@Override
	public String toString() {
		return "GroupeQuestionnaire [groupe_id=" + groupe_id + ", questionnaire_id=" + questionnaire_id + "]";
	}
	
}
