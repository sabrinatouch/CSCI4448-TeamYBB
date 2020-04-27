package com.TeamYBB.springboot.letmein_functionality;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController 
public class EntryController {

    // @RequestBody: Annotation is springboot that binds the HTTP body to the class (i.e JobEntry)
    // Converts body of request into JobEntry type

    /**
     * Add a new entry into database
     */
    @PostMapping("/add-job")
    public String addEntry(@RequestBody JobEntry entry){
        Database db = Database.getInstance();
        db.add(entry);
        return "addEntry: Success";
    }

    /**
     * Update an entry from the database
     */
    @PutMapping("/edit-job")
    public String editEntry(@RequestBody JobEntry entry){
        Database db = Database.getInstance();
        db.update(entry.getID(), entry);
        return "editEntry: success";
    }

    /**
     * Delete an entry from the database
     */
    @DeleteMapping("/delete-job")
    public String deleteEntry(@RequestBody JobEntry entry){
        Database db = Database.getInstance();
        db.delete(entry.getID());
        return "deleteEntry: success";
    }

    /**
     * Get job entries from database
     */
    @GetMapping("/get-jobs")
    public ArrayList<ArrayList<String>> getJobEntries(){
        Database db = Database.getInstance();
        ArrayList<ArrayList<String>> resQuery = db.getAll();
        return resQuery;
    }
}