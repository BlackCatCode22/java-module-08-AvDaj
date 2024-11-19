package com.adam.tues.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getMyGreeting() {
        String myReturnMessage = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<meta charset=\"UTF-8\">"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "<title>Welcome to My Website</title>"
                + "<style>"
                + "body { font-family: Arial, sans-serif; background-color: #f0f8ff; color: #333; text-align: center; padding: 50px; }"
                + "h1 { color: #4CAF50; }"
                + "p { font-size: 18px; }"
                + "footer { margin-top: 50px; font-size: 14px; color: #888; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<h1>Welcome to My Website!</h1>"
                + "<p>******* Hello from my Website! ******</p>"
                + "<footer>"
                + "<p>Powered by Spring Boot</p>"
                + "</footer>"
                + "</body>"
                + "</html>";
        return myReturnMessage;
    }
}
