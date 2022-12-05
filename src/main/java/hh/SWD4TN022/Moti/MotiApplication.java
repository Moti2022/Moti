package hh.SWD4TN022.Moti;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.SWD4TN022.Moti.domain.Answer;
import hh.SWD4TN022.Moti.domain.AnswerRepository;
import hh.SWD4TN022.Moti.domain.Choice;
import hh.SWD4TN022.Moti.domain.ChoiceRepository;
//import hh.SWD4TN022.Moti.domain.Choice;
//import hh.SWD4TN022.Moti.domain.ChoiceRepository;
import hh.SWD4TN022.Moti.domain.Query;
import hh.SWD4TN022.Moti.domain.QueryRepository;
import hh.SWD4TN022.Moti.domain.Question;
import hh.SWD4TN022.Moti.domain.QuestionRepository;
import hh.SWD4TN022.Moti.domain.Type;

@SpringBootApplication
public class MotiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotiApplication.class, args);
	}

	@Bean
	public CommandLineRunner moti(QueryRepository queryRepository, QuestionRepository questionRepository, AnswerRepository answerRepository, ChoiceRepository choiceRepository) {
		return (args) -> {

		Query query = new Query("Yleiskysely", "Opiskelu Haaga-Heliassa");
		queryRepository.save(query);

		Query query2 = new Query("Kysely", "Testikysely");
		queryRepository.save(query2);
		

		Question q1 = new Question("Miksi päätit hakea Haaga-Heliaan?", query, "text");
		Question q2 = new Question("Oletko opiskellut jossain toisessa korkeamman tason koulutuksessa ennen Haaga-Heliaa?", query, "radio");
		Question q3 = new Question("Mitä opiskelet Haaga-Heliassa?", query, "text");
		Question q4 = new Question("Oletko pitänyt opinnoistasi?", query, "text");
		Question q5 = new Question("Mitkä ovat olleet lempi kurssisi?", query, "text");
		Question q6 = new Question("Kuulutko mihinkään opiskelijajärjestöön?", query, "checkbox");
		Question q7 = new Question("Mitä kehitettävää opetuksessa mielestäsi on?", query, "text");
		Question q8 = new Question("Haluaisitko lähteä vaihto-opiskelijaksi?", query, "radio");
		Question q9 = new Question("Onko tavoitteesi pyrkiä töihin heti opintojen jälkeen?", query, "radio");
		Question q10 = new Question("Suosittelisitko Haaga-Heliaa esim. kavereillesi?", query, "radio");
		
		

//		Question testq1 = new Question("Millä kampuksella opiskelet?", query2);

		questionRepository.save(q1);
		questionRepository.save(q2);
		questionRepository.save(q3);
		questionRepository.save(q4);
		questionRepository.save(q5);
		questionRepository.save(q6);
		questionRepository.save(q7);
		questionRepository.save(q8);
		questionRepository.save(q9);
		questionRepository.save(q10);

		//questionRepository.save(testq1);
		
		Choice c1 = new Choice("Kyllä", q2);
		choiceRepository.save(c1);
		Choice c2 = new Choice("Ei", q2);
		choiceRepository.save(c2);
		Choice c3 = new Choice("Atkins", q6);
		choiceRepository.save(c3);
		Choice c4 = new Choice("Helga", q6);
		choiceRepository.save(c4);
		Choice c5 = new Choice("Skuuppi", q6);
		choiceRepository.save(c5);
		Choice c6 = new Choice("Talko", q6);
		choiceRepository.save(c6);
		Choice c7 = new Choice("Kyllä", q8);
		choiceRepository.save(c7);
		Choice c8 = new Choice("Ei", q8);
		choiceRepository.save(c8);
		Choice c9 = new Choice("Kyllä", q9);
		choiceRepository.save(c9);
		Choice c10 = new Choice("Ei", q9);
		choiceRepository.save(c10);
		Choice c11 = new Choice("Kyllä", q10);
		choiceRepository.save(c11);
		Choice c12 = new Choice("Ei", q10);
		choiceRepository.save(c12);
		
		
		Answer a1 = new Answer("Hain muutamaan ammattikorkeakouluun, Haaga-Helia oli ainut mihin pääsin sisään.", q1);
		answerRepository.save(a1);
		Answer a2 = new Answer("En ole.", q2);
		answerRepository.save(a2);
		Answer a3 = new Answer("Tietojenkäsittelyä", q3);
		answerRepository.save(a3);
		Answer a4 = new Answer("Kyllä", q4);
		answerRepository.save(a4);
		Answer a5 = new Answer("Linux palvelimet ja ohjelmoinnin kurssit", q5);
		answerRepository.save(a5);
		Answer a6 = new Answer("En kuulu.", q6);
		answerRepository.save(a6);
		Answer a7 = new Answer("Kaikki materiaalit voisi päivittää ajantasalle.", q7);
		answerRepository.save(a7);
		Answer a8 = new Answer("Voisin harkita.", q8);
		answerRepository.save(a8);
		Answer a9 = new Answer("Kyllä, mielellään jo opintojen aikana.", q9);
		answerRepository.save(a9);
		Answer a10 = new Answer("Kyllä", q10);
		answerRepository.save(a10);

		Answer a11 = new Answer("Vierailin Haaga-Heliassa opiskellessani.", q1);
		answerRepository.save(a11);
		Answer a12 = new Answer("En ole.", q2);
		answerRepository.save(a12);
		Answer a13 = new Answer("Tietojenkäsittelyä", q3);
		answerRepository.save(a13);
		Answer a14 = new Answer("Kyllä", q4);
		answerRepository.save(a14);
		Answer a15 = new Answer("Ohjelmistoprojekti 1", q5);
		answerRepository.save(a15);
		Answer a16 = new Answer("En", q6);
		answerRepository.save(a16);
		Answer a17 = new Answer("Ei ole ehdotuksia.", q7);
		answerRepository.save(a17);
		Answer a18 = new Answer("En", q8);
		answerRepository.save(a18);
		Answer a19 = new Answer("Kyllä", q9);
		answerRepository.save(a19);
		Answer a20 = new Answer("Kyllä", q10);
		answerRepository.save(a20);
			
		};
	}

}
