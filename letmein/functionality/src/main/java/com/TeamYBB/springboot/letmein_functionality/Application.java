package com.TeamYBB.springboot.letmein_functionality;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
    public static void main(String args[]) 
    {
        /*
        
        JobEntry entry = JobEntry.builder()
        .company("Google")
        .status("Accepted")
        .type("Full Time")
        .position("position")
        .build();

        */
        
        Database db = Database.getInstance();
        //db.add(entry);
        System.out.println("Welcome to LETMEIN.");
        SpringApplication.run(Application.class, args);
    }
}