package dev.nawid.SpringRunnerz;
import dev.nawid.SpringRunnerz.run.RunRepository;
import dev.nawid.SpringRunnerz.user.User;
import dev.nawid.SpringRunnerz.user.UserHttpClient;
import dev.nawid.SpringRunnerz.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

@SpringBootApplication
public class SpringRunnerzApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringRunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringRunnerzApplication.class, args);
		//log.info("App started successfully");

		//var welcomeMessage = new WelcomeController();
		//System.out.println(welcomeMessage.getWelcomeMessage());
	}

	@Bean
	UserHttpClient userHttpClient(){
		RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(UserHttpClient.class);
	}

		@Bean
		CommandLineRunner runner(UserRestClient client){
			return args -> {

				List<User> users = client.findAll();
				System.out.println(users);

				User user = client.findById(1);
				System.out.println(user);

			};
		}




}
