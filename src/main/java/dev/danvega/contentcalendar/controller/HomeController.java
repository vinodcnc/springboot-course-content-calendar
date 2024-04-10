package dev.danvega.contentcalendar.controller;

import dev.danvega.contentcalendar.config.ContentCalendarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalendarProperties home(){
        return properties;
    }

//    //Hi Bro is default message in case
//    // cc.welcomeMessage is not defined in application.properties file
//    @Value("${cc.welcomeMessage: Hi Bro}")
//    private String welcomeMessage;
//
//    @Value("${cc.about: Yo!!}")
//    private String about;
//
//    @GetMapping("/")//for root endpoint
//    public Map<String, String> home(){
//        return Map.of("welcomeMessage",welcomeMessage,"about",about);
//    }
}
