package hh.SWD4TN022.Moti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.SWD4TN022.Moti.domain.QuestionRepository;

@Controller
public class QuestionController {

	@Autowired
	private QuestionRepository questionRepo;

	@GetMapping("/questionlist")
	public String listQuestions(Model model) {
		model.addAttribute("questions", questionRepo.findAll());
		return "questionlist";
	}
}
