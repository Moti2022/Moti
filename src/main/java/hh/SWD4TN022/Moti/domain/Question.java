package hh.SWD4TN022.Moti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long question_id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "query_id")
	private Query query;

	public Question() {
	}

	public Question(String name, Query query) {
		super();
		this.name = name;
		this.query = query;
	}

	public Long getQuestion_id() {
		return question_id;
	}

	public String getName() {
		return name;
	}

	public Query getQuery() {
		return query;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", name=" + name + ", query=" + query + "]";
	}

}
