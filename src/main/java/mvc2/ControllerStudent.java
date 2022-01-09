package mvc2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class ControllerStudent {
    @RequestMapping("/")
    public String showMainPage(){
        return "main-page";
    }

    @RequestMapping("/askStudentDetails")
    public String askStudentDetails(Model model){
        model.addAttribute("student", new Student());
        return "ask-std-details-view";
    }

    @RequestMapping("/showStudentDetails")
    public String showStudentDetails(){
        return "show-std-details-view";
    }
}
