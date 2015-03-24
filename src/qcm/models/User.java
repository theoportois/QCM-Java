package qcm.models;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private String password;
	private String mail;
	private Date dateCreation;
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", mail=" + mail + ", dateCreation=" + dateCreation + "]";
	}
	
}
