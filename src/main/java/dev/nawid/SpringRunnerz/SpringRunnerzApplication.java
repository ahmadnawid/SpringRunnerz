package dev.nawid.SpringRunnerz;

import food.bar.WelcomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRunnerzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRunnerzApplication.class, args);

		//var welcomeMessage = new WelcomeController();
		//System.out.println(welcomeMessage.getWelcomeMessage());


	}

}
