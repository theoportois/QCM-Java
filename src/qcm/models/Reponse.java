package qcm.models;

public class Reponse {
	private Integer id;
	private String libelle;
	private int question_id;
	private boolean good;
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
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
	@Override
	public String toString() {
		return "Reponse [id=" + id + ", libelle=" + libelle + ", question_id=" + question_id + ", good=" + good + "]";
	}
	public Reponse() {
		super();
	}
	
	
}
