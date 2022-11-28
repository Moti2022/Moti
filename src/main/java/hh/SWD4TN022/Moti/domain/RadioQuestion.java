package hh.SWD4TN022.Moti.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class RadioQuestion extends Question {

    @ElementCollection
    private List<String> choices;

    public RadioQuestion() {
        super();
        this.choices = new ArrayList<>();
        this.setType("radio");
    }

    public RadioQuestion(String question, Query query) {
        super("text", question, query);
        this.choices = new ArrayList<>();
        this.setType("radio");
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
}
