package dev.nawid.SpringRunnerz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringRunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringRunnerzApplication.class, args);
		//log.info("App started successfully");

		//var welcomeMessage = new WelcomeController();
		//System.out.println(welcomeMessage.getWelcomeMessage());
	}
//		@Bean
//		CommandLineRunner runner(RunRepository runRepository){
//			return args -> {
//				Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
//				runRepository.create(run);
//			};
//		}




}
