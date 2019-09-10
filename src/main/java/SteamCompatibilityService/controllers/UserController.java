package SteamCompatibilityService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String getMessage(){
        return "Hello!";
    }

    @GetMapping("/v1/compareTwoUsers")
    public Integer getCompatibilityScore(int score){
        return score;
    }
}
