package hh.SWD4TN022.Moti.web;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.SWD4TN022.Moti.domain.ChoiceRepository;
import hh.SWD4TN022.Moti.domain.QueryRepository;
import hh.SWD4TN022.Moti.domain.Question;
import hh.SWD4TN022.Moti.domain.QuestionRepository;

@CrossOrigin
@Controller
public class QuestionController {

	String url;

	@Autowired
	private QuestionRepository questionRepo;

	@Autowired
	private QueryRepository queryRepo;

	@GetMapping("/questionlist")
	public String listQuestions(Model model) {
		model.addAttribute("questions", questionRepo.findAll());
		return "questionlist";
	}

	@GetMapping("/addquestion/{id}")
	public String addQuestion(@PathVariable("id") Long query_id, Model model, HttpServletRequest request) {
		model.addAttribute("questions", questionRepo.findAll());
		model.addAttribute("question", new Question());
		model.addAttribute("query", queryRepo.findById(query_id).get());

		url = request.getRequestURI().toString();
		System.out.println(url);
		return "addquestion";
	}

	@PostMapping(value = "/savequestion")
	public String saveQuestion(@ModelAttribute Question newQuestion, Model model) {
		questionRepo.save(newQuestion);
		List<String> urlList = Arrays.asList(url.split("/"));
		String redirectId = urlList.get(2);
		return "redirect:/addquestion/" + redirectId;
	}

	// REST all questions
	@GetMapping("/questions")
	public @ResponseBody List<Question> questionListRest() {
		return (List<Question>) questionRepo.findAll();
	}
	
	// REST fetching question by id
	@GetMapping("questions/{question_id}")
	public @ResponseBody Optional<Question> findByQuestionRest(@PathVariable("question_id") Long id){
		return questionRepo.findById(id);
	}
	
	// REST saving a question
	@PostMapping("/questions")
	public @ResponseBody Question saveQuestionRest (@RequestBody Question question) {
	return questionRepo.save(question);
	}
	
	//TODO: REST put
}
