package hh.SWD4TN022.Moti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Choice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long choice_id;
	private String name;

	@JoinColumn(name = "question_id")
	private Question question;

	public Choice() {

	}

	public Choice(String name, Question question) {
		super();
		this.name = name;
		this.question = question;
	}

	public Long getChoice_id() {
		return choice_id;
	}

	public String getName() {
		return name;
	}

	public Question getQuestion() {
		return question;
	}

	public void setChoice_id(Long choice_id) {
		this.choice_id = choice_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Choice [choice_id=" + choice_id + ", name=" + name + ", question=" + question + "]";
	}

}
