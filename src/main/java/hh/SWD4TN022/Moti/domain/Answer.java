package hh.SWD4TN022.Moti.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long answer_id;
	private String text;
	
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;

	public Answer() {
		
	}
	public Answer(Long answer_id, String text, Question question) {
		super();
		this.text = text;
		this.question = question;
	}
	public Long getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(Long answer_id) {
		this.answer_id = answer_id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", text=" + text + "]";
	}
}
