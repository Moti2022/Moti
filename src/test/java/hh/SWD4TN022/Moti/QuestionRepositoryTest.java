package hh.SWD4TN022.Moti;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.SWD4TN022.Moti.domain.QuestionRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class QuestionRepositoryTest {
	@Autowired
	private QuestionRepository QuesRepository;
	
	

}
