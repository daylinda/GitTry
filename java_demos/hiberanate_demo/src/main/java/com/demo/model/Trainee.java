package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Trainee_tb1")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "traineeName", nullable = false, length=30)
	private String name;
	@Column(unique = true)
	private long contact;
	private int age;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aid")
	private Address address;
	private String gender;
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
//	public Trainee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	
	
	public int getId() {
		return id;
	}
	
	
	public Trainee(String name, long contact, int age, Address address, String gender) {
	super();
	this.name = name;
	this.contact = contact;
	this.age = age;
	this.address = address;
	this.gender = gender;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", contact=" + contact + ", age=" + age + ", address=" + address
				+ ", gender=" + gender + "]";
	}

	
	
	

}
