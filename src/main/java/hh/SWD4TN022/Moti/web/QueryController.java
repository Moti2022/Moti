package hh.SWD4TN022.Moti.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.SWD4TN022.Moti.domain.Query;
import hh.SWD4TN022.Moti.domain.QueryRepository;
import hh.SWD4TN022.Moti.domain.QuestionRepository;

@Controller
public class QueryController {

	@Autowired
	private QueryRepository queryRepo;

	@Autowired
	private QuestionRepository questionRepo;

	@GetMapping("/querylist")
	public String getQuery(Model model) {
		model.addAttribute("queries", queryRepo.findAll());
		model.addAttribute("questions", questionRepo.findAll());
		return "querylist";
	}

	@GetMapping("/addquery")
	public String addQuery(Model model) {
		model.addAttribute("query", new Query());
		return "addquery";
	}

	@PostMapping(value = "/save")
	public String saveQuery(@ModelAttribute Query newQuery, Model model) {
		queryRepo.save(newQuery);
		return "redirect:querylist";
	}

	// REST all queries
	@GetMapping("/queries")
	public @ResponseBody List<Query> queryListRest() {
		return (List<Query>) queryRepo.findAll();
	}
}
