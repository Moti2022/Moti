package hh.SWD4TN022.Moti.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.SWD4TN022.Moti.domain.Query;
import hh.SWD4TN022.Moti.domain.QueryRepository;
import hh.SWD4TN022.Moti.domain.Question;
import hh.SWD4TN022.Moti.domain.QuestionRepository;

@Controller
public class QueryController {
	
	
	@Autowired
	private QuestionRepository queryRepo;

	@GetMapping("/querylist")
	public String getQuery(Model model) {
	
		model.addAttribute("queries", queryRepo.findAll()  );
		return "querylist";
	}
}
	
	
	


