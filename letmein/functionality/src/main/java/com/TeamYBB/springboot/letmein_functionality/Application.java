package com.TeamYBB.springboot.letmein_functionality;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
    public static void main(String args[]) 
    {
        SpringApplication.run(Application.class, args);
        Database db = Database.getInstance();

        JobEntry entry = new JobEntry("Accepted", "16 Apr, 2020", "Facebook", "CEO", "Full Time");
        System.out.println("Created job");

        if (db.add(entry)) {
            System.out.println("Add: Success");
        } else {
            System.out.println("Add: Fail");
        }

        System.out.println("Welcome to LETMEIN."); 
    }
}