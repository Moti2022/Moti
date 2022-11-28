package hh.SWD4TN022.Moti.domain;

import javax.persistence.Entity;

@Entity
public class TextQuestion extends Question {

	public TextQuestion() {
		super();
		this.setType("text");
	}
	
	public TextQuestion(String question, Query query) {
		super("text", query, question);
		this.setType("text");
	}
	
}
