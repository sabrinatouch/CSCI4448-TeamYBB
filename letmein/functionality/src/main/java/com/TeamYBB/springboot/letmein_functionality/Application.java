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
        System.out.println("Welcome to LETMEIN."); 
    }
}