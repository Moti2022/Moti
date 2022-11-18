package hh.SWD4TN022.Moti;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hh.SWD4TN022.Moti.web.AnswerController;
import hh.SWD4TN022.Moti.web.QueryController;
import hh.SWD4TN022.Moti.web.QuestionController;


@SpringBootTest
class MotiApplicationTests {

	@Autowired
	private QueryController queryController;
	
	@Autowired
	private QuestionController questionController;
	
	@Autowired
	private AnswerController answerController;
	
	// smoke test for queryController
	@Test
	public void contextLoads() {
		assertThat(queryController).isNotNull();
	}
	
	// smoke test for questionController
	@Test
	public void contextLoads2() {
		assertThat(questionController).isNotNull();
	}
	
	// smoke test for answerController
	@Test
	public void contextLoads3() {
		assertThat(answerController).isNotNull();
	}

}
