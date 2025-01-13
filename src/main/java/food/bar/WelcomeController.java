package food.bar;

import org.springframework.stereotype.Component;

@Component
public class WelcomeController {


    public String getWelcomeMessage(){
        return "Welcome to Springboot App.";
    }
}
