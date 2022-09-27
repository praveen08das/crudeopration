package com.spring.core;

public class Student {
	
	    private int id;
	    private String name;
	    private String adress;
	    private String dateOfBirth;
	    
	    
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", adress=" + adress + ", dateOfBirth=" + dateOfBirth + "]";
		}
		public Student() {
			super();
			
		}
		public Student(int id, String name, String adress, String dateOfBirth) {
			super();
			this.id = id;
			this.name = name;
			this.adress = adress;
			this.dateOfBirth = dateOfBirth;
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
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
	    
	

}
