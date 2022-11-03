package hh.SWD4TN022.Moti.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	// List all queries
	@GetMapping("/querylist")
	public String getQuery(Model model) {
		model.addAttribute("queries", queryRepo.findAll());
		model.addAttribute("questions", questionRepo.findAll());
		return "querylist";
	}

	// Add new Query
	@GetMapping("/addquery")
	public String addQuery(Model model) {
		model.addAttribute("query", new Query());
		return "addquery";
	}

	// Save new Query
	@PostMapping(value = "/save")
	public String saveQuery(@ModelAttribute Query newQuery, Model model) {
		queryRepo.save(newQuery);
		return "redirect:querylist";
	}

	// Add questions for query based on it's id (NOT FINISHED)
	@GetMapping("/listquestions")
	public String listQueryQuestions(Model model) {
		model.addAttribute("query", queryRepo.findAll());
		return "listquestions";
	}

	// REST all queries
	@GetMapping("/queries")
	public @ResponseBody List<Query> queryListRest() {
		return (List<Query>) queryRepo.findAll();
	}

	// REST fetching query by id
	@GetMapping("queries/{query_id}")
	public @ResponseBody Optional<Query> findQueryRest(@PathVariable("query_id") Long id) {
		return queryRepo.findById(id);
	}
}
