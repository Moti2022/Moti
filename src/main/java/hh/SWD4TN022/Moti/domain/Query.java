package hh.SWD4TN022.Moti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Query {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long query_id;



    String heading;
    String description;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "query")
    private List <Question> questions;

    Query() {}

    public Query(String heading, String description){
        super();

        this.heading = heading;
        this.description = description;
    }


    public Long getQuery_id() {
        return query_id;
    }

    public void setQuery_id(Long query_id) {
        this.query_id = query_id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

  
    
    


}
