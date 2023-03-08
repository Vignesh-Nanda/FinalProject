package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospital_details")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "First_name")
	private String fname;
	@Column(name = "Last_name")
	private String lname;
	@Column(name = "Age")
	private int age;
	@Column(name = "Gender")
	private String gen;
	@Column(name = "Phone_Number")
	private long mob;
	@Column(name = "Email")
	private String email;
	@Column(name = "Marital_Status")
	private String mstatus;
	@Column(name = "Emergency_Contact")
	private long Econ;
	@Column(name = "Address")
	private String add;
	@Column(name = "Zipcode")
	private long zip;

	public Hospital(int id, String fname, String lname, int age, String gen, long mob, String email, String mstatus,
			long econ, String add, long zip) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gen = gen;
		this.mob = mob;
		this.email = email;
		this.mstatus = mstatus;	
		Econ = econ;
		this.add = add;
		this.zip = zip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMstatus() {
		return mstatus;
	}

	public void setMstatus(String mstatus) {
		this.mstatus = mstatus;
	}

	public long getEcon() {
		return Econ;
	}

	public void setEcon(long econ) {
		Econ = econ;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public Hospital() {
	}

}
