package hh.SWD4TN022.Moti;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import hh.SWD4TN022.Moti.domain.Query;
import hh.SWD4TN022.Moti.domain.QueryRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class QueryRepositoryTest {
	
	@Autowired
	private QueryRepository queryrepo;
	
	// testing to find query by heading
	@Test
	public void createNewQuery() {
		List<Query> queries = queryrepo.findByHeading("Testikysely1");
		assertThat(queries).hasSize(1);
		assertThat(queries.get(0).getHeading()).isEqualTo("Testikysely1");
		
	}
	
	

}
