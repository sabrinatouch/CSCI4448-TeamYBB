package com.TeamYBB.springboot.letmein_functionality;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
public class EntryController {

    // @RequestBody: Annotation is springboot that binds the HTTP body to the class (i.e JobEntry)
    // Converts body of request into JobEntry type

    /**
     * Add a new entry into database
     */
    @PostMapping("/jobs")
    public String addEntry(@RequestBody JobEntry entry){
        Database db = Database.getInstance();
        db.add(entry);
        return "addEntry: Success";
    }

    /**
     * Update an entry from the database
     */
    @PutMapping("/jobs")
    public String editEntry(@RequestBody JobEntry entry){
        Database db = Database.getInstance();
        db.update(entry.getID(), entry);
        return "editEntry: success";
    }

    /**
     * Delete an entry from the database
     */
    @DeleteMapping("/jobs")
    public String deleteEntry(@RequestBody JobEntry entry){
        Database db = Database.getInstance();
        db.delete(entry.getID());
        return "deleteEntry: success";
    }
}