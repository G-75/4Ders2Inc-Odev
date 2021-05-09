package dorduncuDers2Odev.entities;

import dorduncuDers2Odev.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String eMail;
	
	public User() {
		
	}

	public User(int id, String eMail) {
		super();
		this.id = id;
		this.eMail = eMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
