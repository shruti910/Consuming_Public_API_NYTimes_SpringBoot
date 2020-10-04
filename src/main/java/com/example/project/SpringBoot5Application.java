package com.example.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SpringBoot5Application {
  

	public static void main(String[] args) {
           
    SpringApplication.run(SpringBoot5Application.class, args);
   
}
       
//        
//        @Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			News news = restTemplate.getForObject(
//					"https://api.nytimes.com/svc/topstories/v2/home.json?api-key=V1mnJN8OlIxwqrPMx96F4hAqdGuy8VRD", News.class);
//			log.info(news.toString());
//		};
//	}
}
