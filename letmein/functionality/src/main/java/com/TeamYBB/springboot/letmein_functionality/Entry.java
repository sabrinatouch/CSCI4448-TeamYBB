package com.TeamYBB.springboot.letmein_functionality;

// @getter // annotations
public interface Entry {
    
    public String getCompany();
    public String getPosition();
    public String getStatus();
    public String getDate();
    public String getType();
    public int getID();

    public void setCompany(String company);
    public void setPosition(String position);
    public void setStatus(String status);
    public void setDate(String date);
    public void setType(String type);
    public void setID(int id);

};