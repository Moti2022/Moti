package hh.SWD4TN022.Moti.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QueryRepository  extends CrudRepository<Query, Long>{
    List<Query> findByHeading(String heading);
    
}
