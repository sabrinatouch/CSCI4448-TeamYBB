package com.TeamYBB.springboot.letmein_functionality;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
public class addEntry {

    @PostMapping("/jobs")

    // @RequestBody: Annotation is springboot that binds the HTTP body to the class (i.e JobEntry)
    // Converts body of request into JobEntry type
    public String addJob(){
        return "String";
    }

}