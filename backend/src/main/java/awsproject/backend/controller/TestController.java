package awsproject.backend.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {

    @RequestMapping("/api/test")
    public String test() {
        return "TEST";
    }
}
