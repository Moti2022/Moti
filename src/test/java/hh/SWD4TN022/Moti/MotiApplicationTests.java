package hh.SWD4TN022.Moti;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hh.SWD4TN022.Moti.web.QueryController;
import hh.SWD4TN022.Moti.web.QuestionController;


@SpringBootTest
class MotiApplicationTests {

	@Autowired
	private QueryController queryController;
	
	@Autowired
	private QuestionController questionController;
	
	@Test
	public void contextLoads() {
		assertThat(queryController).isNotNull();
	}
	
	@Test
	public void contextLoads2() {
		assertThat(questionController).isNotNull();
	}

}
