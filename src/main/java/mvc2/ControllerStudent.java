package mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class ControllerStudent {
    @RequestMapping("/")
    public String showMainPage() {
        return "main-page";
    }

    @RequestMapping("/askStudentDetails")
    public String askStudentDetails(Model model) {
        model.addAttribute("student", new Student());
        return "ask-std-details-view";
    }

    @RequestMapping("/showStudentDetails")
    public String showStudentDetails(@Valid @ModelAttribute("student") Student std, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "ask-std-details-view";
        }else{
            return "show-std-details-view";
        }
    }
}
