package com.TeamYBB.springboot.letmein_functionality;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class getJobs {
    @RequestMapping("/")
    public String getUserJobs(){
        return "String";
    }
}