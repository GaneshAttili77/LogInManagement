package service;

import model.LoginModal;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

@Component
public class LoginService{

    public LoginModal saveData(LoginModal loginModal) {
        // Simulating data persistence logic
        System.out.println("Saving data: " + loginModal);
        return loginModal;
    }
}
