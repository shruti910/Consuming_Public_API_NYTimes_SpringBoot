package com.example.project;

import java.util.Map;

//import org.apache.tomcat.util.http.parser.MediaType;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


//As you are using Spring Boot web, Jackson dependency is implicit and we do not have to define explicitly.
//Jackson is used by default to serialize and to deserialize objects.
//However, it doesn't know how to serialize the JSONObject. If you want to create a dynamic JSON structure, you can use a Map
@RestController
public class NewsController {
 @Autowired
	private NewsService nService;
@GetMapping(value = "/api/news/topstories")
	public  NewsWrapper getNews() {
           
            System.out.println(nService.getTopStories()); //for console
        
                return nService.getTopStories();
	}

}
