package hh.SWD4TN022.Moti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import hh.SWD4TN022.Moti.domain.QueryRepository;

@Controller
public class AnswerController {
    

    @Autowired
    private QueryRepository queryRepo;

	// List all answers
	@GetMapping( "/listanswers/{id}")
	public String getQuery(@PathVariable("id") Long query_id, Model model) {
		model.addAttribute("questions", queryRepo.findById(query_id).get().getQuestions());
		return "listanswers";
	}

}
