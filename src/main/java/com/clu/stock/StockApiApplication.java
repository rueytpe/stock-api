package com.clu.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication(exclude = { JacksonAutoConfiguration.class }) // Exclude the automatic configuration of JACKSON
public class StockApiApplication {

	@Value("${alphavantage.url}")
	private String url;

	@Bean
	RestClient getRestClient(RestClient.Builder builder) {
		return builder.baseUrl(url).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(StockApiApplication.class, args);
	}

}
