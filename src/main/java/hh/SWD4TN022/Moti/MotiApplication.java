package hh.SWD4TN022.Moti;

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

			Query query1 = new Query("Kulttuurikysely",
					"Kyselyssä kysytään suositeltavia elokuvaa, tv-sarjaa ja musiikkia");
			queryRepository.save(query1);
			Query query2 = new Query("Urheilutapahtuma Helsingissä 2023",
					"Millainen on sinun unelma urheilutapahtumasi ensi vuodelle");
			queryRepository.save(query2);

			Question q1 = new Question("Mitä elokuvaa suosittelet", query1);
			Question q2 = new Question("Mitä tv-sarjaa suosittelet", query1);
			Question q3 = new Question("Mitä musiiikkia suosittelet", query1);

			Question q4 = new Question("Mitä urheilulajeja haluat, että tapahtumassa pääsisi kokeilemaan?", query2);

			questionRepository.save(q1);
			questionRepository.save(q2);
			questionRepository.save(q3);
			questionRepository.save(q4);
		};
	}
}
