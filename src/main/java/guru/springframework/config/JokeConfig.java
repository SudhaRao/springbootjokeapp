package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

// The bean configuration can be done by creating thw JokeConfig class and using @Configuration and @Bean annotations. 

//If we want to use XML config file, then this class is not necessary. This project contains joke-config.xml which demonstrates XML way of doing it too.

//@Configuration - spring will not see this instead it will pick up from joke-config.xml
public class JokeConfig {
	
	//@Bean - spring will not see this instead it will pick up from joke-config.xml
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
	
}
