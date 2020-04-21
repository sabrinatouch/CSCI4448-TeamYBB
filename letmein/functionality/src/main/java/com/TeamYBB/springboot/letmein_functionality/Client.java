package com.TeamYBB.springboot.letmein_functionality;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Client
{ 
    public static void main(String args[]) 
    { 
        SpringApplication.run(Client.class, args);
        System.out.println("Welcome to LETMEIN."); 

        // Make instance of command controller
        //Invoker control = new Invoker(); // can rename to CommandControl control = new CommandControl();

        // Make instance of an entry
        //Entry entry = new Entry();

        // Make instances of different commands
        //Command addEntry = new AddEntry(entry);
        //Command deleteEntry = new DeleteEntry(entry);
        //Command editEntry = new EditEntry(entry);

        //Examples of how to execute a command
        //control.executeCommand(addEntry);

    } 
} 