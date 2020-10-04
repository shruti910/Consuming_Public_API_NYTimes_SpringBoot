package com.example.project;

import java.util.Map;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class NewsService {
	
  @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
        @Autowired
	private final RestTemplate restTemplate;
       
        public NewsService() {
		this.restTemplate = new RestTemplate();
	}

	
	public NewsWrapper getTopStories() {
            
		 NewsWrapper alltopnews ;
		String getUrl = "https://api.nytimes.com/svc/topstories/v2/home.json?api-key=V1mnJN8OlIxwqrPMx96F4hAqdGuy8VRD";
		HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<NewsWrapper> wrappernewsresponse = restTemplate.exchange(getUrl, HttpMethod.GET, entity, NewsWrapper.class);
		//if (wrappernewsresponse.getStatusCode() == HttpStatus.OK) {
			alltopnews = wrappernewsresponse.getBody();
                        
                        System.out.println(wrappernewsresponse); //for console
                        System.out.println(alltopnews.toString());   //for console

   // }

return alltopnews;
	}
}
