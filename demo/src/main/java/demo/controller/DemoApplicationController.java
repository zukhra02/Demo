package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {

    // Mapping for the root endpoint
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }

    // Mapping for the /goodbye endpoint
    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot";
    }
}