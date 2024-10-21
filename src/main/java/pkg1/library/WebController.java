package pkg1.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@Autowired
	LibraryRepo lr;
	
	@GetMapping("/web/get/book")
	public String getBook(Model model) {
		LibraryEntity le=lr.findAll().get(0);
		model.addAttribute("title",le.getBookTitle());
		model.addAttribute("year",le.getYear());
		model.addAttribute("publisher",le.getPublisher());
		model.addAttribute("author",le.getAuthor());
		return "library";
	}

}
