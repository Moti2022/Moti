package hh.SWD4TN022.Moti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long question_id;
	private String name;
	private String type;


	@JsonIgnoreProperties("questions")
	@ManyToOne
	@JoinColumn(name = "query_id")
	private Query query;

	@JsonIgnoreProperties("question")
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<Answer> answers;
	
	public Question() {
	}

//	public Question(String name, Query query, List<Choice> choices, Type type) {
//		super();
//		this.name = name;
//		this.query = query;
//		this.choices = choices;
//		this.type = type;
//	}
	
	public Question(String name, Query query, String type) {
		super();
		this.name = name;
		this.query = query;
		this.type = type;
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
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", name=" + name + ", query=" + query + "]";
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
