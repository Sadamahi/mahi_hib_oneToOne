package com.one.to.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANSWER")
public class Answer {
    @Id 
	private int id;
	@Column(length=200)
    private String answer_title ;
	
	
	
	public Answer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Answer(int id, String answer_title) {
		super();
		this.id = id;
		this.answer_title = answer_title;
	}
	public String getAnswer_title() {
		return answer_title;
	}
	public void setAnswer_title(String answer_title) {
		this.answer_title = answer_title;
	}
	
	
	
}
