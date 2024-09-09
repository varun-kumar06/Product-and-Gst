package com.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UseProductConfig {
	
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}

}
