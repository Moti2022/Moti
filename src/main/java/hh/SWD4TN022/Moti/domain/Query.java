package hh.SWD4TN022.Moti.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Query {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long query_id;



    String heading;
    String description;

    List <Question> questions;

    public Query(){

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

    public Query(String heading, String description){
        super();

        this.heading = heading;
        this.description = description;
    }
    
    


}
