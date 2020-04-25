package com.TeamYBB.springboot.letmein_functionality;

public class EntryFactory {
    public Entry createEntry(String status, String date, String company, String position, String type){
        if(type == "Full Time"){
            return new JobEntry(status, date, company, position, type);
        }
        else if(type == "Internship"){
            return new InternshipEntry(status, date, company, position, type);
        }

        return null;
    }
}