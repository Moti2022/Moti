package hh.SWD4TN022.Moti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import hh.SWD4TN022.Moti.domain.QueryRepository;


@Controller
public class QueryController {
	
	
	@Autowired
	private QueryRepository queryRepo;

	@GetMapping("/querylist")
	public String getQuery(Model model) {
	
		model.addAttribute("queries", queryRepo.findAll()  );
		return "querylist";
	}
}
	
	
	


