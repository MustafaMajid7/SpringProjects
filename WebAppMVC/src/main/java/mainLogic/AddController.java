package mainLogic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("f1") int i,@RequestParam("f2") int j) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("Result",i+j);
		mv.setViewName("AdditionPage.jsp");
		
		return mv;
	}
	
}
