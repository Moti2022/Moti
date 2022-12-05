package hh.SWD4TN022.Moti.web;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.SWD4TN022.Moti.domain.Choice;
import hh.SWD4TN022.Moti.domain.ChoiceRepository;
import hh.SWD4TN022.Moti.domain.Question;
import hh.SWD4TN022.Moti.domain.QuestionRepository;

@CrossOrigin
@Controller
public class ChoiceController {
	
	String url;
	
	@Autowired
	private ChoiceRepository choiceRepo;
	
	@Autowired
	private QuestionRepository questionRepo;
	
	@GetMapping("/addchoice/{id}")
	public String addChoice(@PathVariable("id") Long question_id, Model model, HttpServletRequest request) {
		model.addAttribute("choices", choiceRepo.findAll());
		model.addAttribute("choice", new Choice());
		model.addAttribute("question", questionRepo.findById(question_id).get());

		url = request.getRequestURI().toString();
		System.out.println(url);
		return "addchoice";
	}
	
	@PostMapping(value = "/savechoice")
	public String saveChoice(@ModelAttribute Choice newChoice, Model model) {
		choiceRepo.save(newChoice);
		List<String> urlList = Arrays.asList(url.split("/"));
		String redirectId = urlList.get(2);
		return "redirect:/addchoice/" + redirectId;
	}
	
	// REST all choices
	@GetMapping("/choices")
	public @ResponseBody List<Choice> choiceListRest() {
		return (List<Choice>) choiceRepo.findAll();
	}

}
