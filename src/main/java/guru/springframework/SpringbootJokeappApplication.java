package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:joke-config.xml")
public class SpringbootJokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJokeappApplication.class, args);
	}

}
