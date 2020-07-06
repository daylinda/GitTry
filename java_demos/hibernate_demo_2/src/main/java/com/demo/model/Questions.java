package com.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
public class Questions {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int qid;
	private String questionName;
	
	@OneToMany(mappedBy = "a_qid")
	List<Answers> answers = new ArrayList<>();
	
	public Questions() {
		// TODO Auto-generated constructor stub
	}

	public Questions(String question, List<Answers> answers) {
		super();
		this.questionName = question;
		this.answers = answers;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return questionName;
	}

	public void setQuestion(String question) {
		this.questionName = question;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", questionName=" + questionName + ", answers=" + answers + "]";
	}
	
	
	
	

}

