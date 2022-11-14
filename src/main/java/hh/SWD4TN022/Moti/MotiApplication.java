package hh.SWD4TN022.Moti;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.SWD4TN022.Moti.domain.Answer;
import hh.SWD4TN022.Moti.domain.AnswerRepository;
import hh.SWD4TN022.Moti.domain.Query;
import hh.SWD4TN022.Moti.domain.QueryRepository;
import hh.SWD4TN022.Moti.domain.Question;
import hh.SWD4TN022.Moti.domain.QuestionRepository;

@SpringBootApplication
public class MotiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotiApplication.class, args);
	}

	@Bean
	public CommandLineRunner moti(QueryRepository queryRepository, QuestionRepository questionRepository, AnswerRepository answerRepository) {
		return (args) -> {

		Query query = new Query("Yleiskysely", "Opiskelu Haaga-Heliassa");
		queryRepository.save(query);

		Query query2 = new Query("Testquery", "test description");
		queryRepository.save(query2);

		Question q1 = new Question("Miksi päätit hakea Haaga-Heliaan?", query);
		Question q2 = new Question("Oletko opiskellut jossain toisessa korkeamman tason koulutuksessa ennen Haaga-Heliaa?", query);
		Question q3 = new Question("Mitä opiskelet Haaga-Heliassa?", query);
		Question q4 = new Question("Oletko pitänyt opinnoistasi?", query);
		Question q5 = new Question("Mitkä ovat olleet lempi kurssisi?", query);
		Question q6 = new Question("Kuulutko mihinkään opiskelijajärjestöön?", query);
		Question q7 = new Question("Mitä kehitettävää opetuksessa mielestäsi on?", query);
		Question q8 = new Question("Haluaisitko lähteä vaihto-opiskelijaksi?", query);
		Question q9 = new Question("Onko tavoitteesi pyrkiä töihin heti opintojen jälkeen?", query);
		Question q10 = new Question("Suosittelisitko Haaga-Heliaa esim. kavereillesi?", query);
		

		Question testq = new Question("test question", query2);

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

		questionRepository.save(testq);
		
		Answer a1 = new Answer("Hain muutamaan ammattikorkeakouluun", q1);
		answerRepository.save(a1);
		Answer a2 = new Answer("Hain muutamaan ammattikorkeakouluun", q2);
		answerRepository.save(a2);
		Answer a3 = new Answer("Hain muutamaan ammattikorkeakouluun", q3);
		answerRepository.save(a3);

	
			
		};
	}

}
