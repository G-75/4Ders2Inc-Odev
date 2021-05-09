package dorduncuDers2Odev.entities;

import java.time.LocalDate;

import dorduncuDers2Odev.abstracts.Entity;

public class Gamer implements Entity {
	private String gamerFirstName;
	private String gamerLastName;;
	private LocalDate dateOfBirthday;
	private String nationalityId;
	
	
		public Gamer() {
		
	}


		public Gamer(String gamerFirstName, String gamerLastName, LocalDate dateOfBirthday, String nationalityId) {
			super();
			this.gamerFirstName = gamerFirstName;
			this.gamerLastName = gamerLastName;
			this.dateOfBirthday = dateOfBirthday;
			this.nationalityId = nationalityId;
		}


		public String getGamerFirstName() {
			return gamerFirstName;
		}


		public void setGamerFirstName(String gamerFirstName) {
			this.gamerFirstName = gamerFirstName;
		}


		public String getGamerLastName() {
			return gamerLastName;
		}


		public void setGamerLastName(String gamerLastName) {
			this.gamerLastName = gamerLastName;
		}


		public LocalDate getDateOfBirthday() {
			return dateOfBirthday;
		}


		public void setDateOfBirthday(LocalDate dateOfBirthday) {
			this.dateOfBirthday = dateOfBirthday;
		}


		public String getNationalityId() {
			return nationalityId;
		}


		public void setNationalityId(String nationalityId) {
			this.nationalityId = nationalityId;
		}
	
	
}
