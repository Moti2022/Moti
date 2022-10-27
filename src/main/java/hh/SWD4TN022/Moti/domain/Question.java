package hh.SWD4TN022.Moti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long question_id;
	private String name;

	public Question() {
	}

	public Question(Long question_id, String name) {
		super();
		this.question_id = question_id;
		this.name = name;
	}

	public Long getQuestion_id() {
		return question_id;
	}

	public String getName() {
		return name;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", name=" + name + "]";
	}
}
