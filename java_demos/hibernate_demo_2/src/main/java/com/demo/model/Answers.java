package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Answers {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int aid;
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	private String answer;
	private String answeredBy;
	
	@Column(name ="qid")
	@ManyToOne
	private Questions a_qid;
	
	public Questions getA_qid() {
		return a_qid;
	}

	public void setA_qid(Questions a_qid) {
		this.a_qid = a_qid;
	}

	public Answers() {
		// TODO Auto-generated constructor stub
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnsweredBy() {
		return answeredBy;
	}

	public void setAnsweredBy(String answeredBy) {
		this.answeredBy = answeredBy;
	}

	public Answers(String answer, String answeredBy) {
		super();
		this.answer = answer;
		this.answeredBy = answeredBy;
	}
	
	
	
}
