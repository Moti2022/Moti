package hh.SWD4TN022.Moti;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
	public CommandLineRunner moti(QueryRepository queryRepository, QuestionRepository questionRepository) {
		return (args) -> {

			// queryRepository.save(new Query("test query", "test"));

			// questionRepository.save(new Question("Kysymys",
			// queryRepository.findByHeading("test query").get(0)));
			// questionRepository.save(new Question("Kysymys2",
			// queryRepository.findByHeading("test query").get(0)));

			List<Question> questions = new ArrayList<Question>();
			Question q1 = new Question("Testikysymys1");
			Question q2 = new Question("Testikysymys2");
			questions.add(q1);
			questions.add(q2);

			queryRepository.save(new Query("Testikysely1", "Joku testi", questions));
		};
	}
}
