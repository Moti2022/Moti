package hh.SWD4TN022.Moti.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.SWD4TN022.Moti.domain.Answer;
import hh.SWD4TN022.Moti.domain.AnswerRepository;
import hh.SWD4TN022.Moti.domain.QueryRepository;

@Controller
public class AnswerController {

	@Autowired
	private QueryRepository queryRepo;

	@Autowired
	private AnswerRepository answerRepo;

	// List all answers
	@GetMapping("/listanswers/{id}")
	public String getQuery(@PathVariable("id") Long query_id, Model model) {
		model.addAttribute("questions", queryRepo.findById(query_id).get().getQuestions());
		return "listanswers";
	}

	// REST all answers
	@GetMapping("/answers")
	public @ResponseBody List<Answer> answerListRest() {
		return (List<Answer>) answerRepo.findAll();
	}

	// REST fetching answer by id
	@GetMapping("answers/{answer_id}")
	public @ResponseBody Optional<Answer> findAnswerRest(@PathVariable("answer_id") Long id) {
		return answerRepo.findById(id);
	}

	// REST saving an answer
	@PostMapping("/answers")
	public @ResponseBody Answer saveAsnwerRest(@RequestBody Answer answer) {
		return answerRepo.save(answer);
	}

}
