package hh.SWD4TN022.Moti.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ChoiceRepository extends CrudRepository<Choice, Long>{
	List<Choice> findByName(String name);
}
