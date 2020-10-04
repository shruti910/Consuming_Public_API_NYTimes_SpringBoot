package com.example.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.persistence.Entity;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status",
"section",
"results"
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class NewsWrapper {

@JsonProperty("status")
private String status;
@JsonProperty("section")
private String section;
@JsonProperty("results")
private List<News> news = null;

/**
* No args constructor for use in serialization
*
*/
public NewsWrapper() {
}

/**
*
* @param section
* @param news
* @param status
*/
public NewsWrapper(String status, String section, List<News> news) {
super();
this.status = status;
this.section = section;
this.news = news;
}

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("section")
public String getSection() {
return section;
}

@JsonProperty("section")
public void setSection(String section) {
this.section = section;
}

@JsonProperty("results")
public List<News> getResults() {
return news;
}

@JsonProperty("results")
public void setResults(List<News> news) {
this.news = news;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("status", status).append("section", section).append("results", news).toString();
}

}