package controller.login;

import model.LoginModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.LoginService;

import java.util.Queue;

@Controller
@RequestMapping("/login")
public class LoginController {
//    @Autowired
//    private LoginService loginService;

//    public LoginController(LoginService loginService) {
//        this.loginService = loginService;
//    }


    @GetMapping("/")
    public String getIndex(Model model, LoginModal loginModal){
        System.out.println("Login Page");
        model.addAttribute("loginModal", loginModal);
      return  "login/signIn";
    }
    @PostMapping("/data")
    public LoginModal getData(Model model, LoginModal loginModal){
      return loginModal;

    }

}
