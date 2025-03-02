package controller.login;
import model.LoginModal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getIndex(Model model, LoginModal loginModal){
        System.out.println("Login Page");
        model.addAttribute("loginModal", loginModal);
        return  "login/signIn";
    }
}
