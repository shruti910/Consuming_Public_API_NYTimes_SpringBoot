

package com.example.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import javax.persistence.Entity;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"section",
"title"
})
@JsonIgnoreProperties(ignoreUnknown = true)

public class News {

@JsonProperty("section")
private String section;

@JsonProperty("title")
private String title;

/**
* No args constructor for use in serialization
*
*/
public News() {
}

/**
*

* @param section
* @param title
*/
public News(String section, String title) {
super();
this.section = section;

this.title = title;
}

@JsonProperty("section")
public String getSection() {
return section;
}

@JsonProperty("section")
public void setSection(String section) {
this.section = section;
}



@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("section", section).append("title", title).toString();
}

//@Override
//  public String toString() {
//    return "Result [section=" + section + ", subsection=" + subsection
//        + ", title=" + title + "]";
//  }

}