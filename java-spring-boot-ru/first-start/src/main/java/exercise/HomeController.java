package exercise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping("/about")
    public ResponseEntity<String> aboutTest(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome to Hexlet!");
    }
}
