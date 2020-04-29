/**
 * Design Pattern: Builder
 */

package com.TeamYBB.springboot.letmein_functionality;

public class JobEntry implements Entry{
    // Change order of variables as displayed. Can do later.
    private String company;
    private String position;
    private String status;
    private String date;
    private String type;
    private int id;
    
    public JobEntry(){
        
    }

    private JobEntry(JobEntryBuilder builder){
        this.company = builder.company;
        this.position = builder.position;
        this.status = builder.status;
        this.date = builder.date;
        this.type = builder.type;
    }

    public static JobEntryBuilder builder(){
        return new JobEntryBuilder();
    }

    @Override
    public String getCompany(){
        return this.company;
    }

    @Override
    public String getPosition(){
        return this.position;
    }

    @Override
    public String getStatus(){
        return this.status;
    }

    @Override
    public String getDate(){
        return this.date;
    }

    @Override
    public String getType(){
        return this.type;
    }

    @Override
    public int getID(){
        return this.id;
    }

    @Override
    public void setID(int id){
        this.id = id;
    }

    public static class JobEntryBuilder{
        private String company = "";
        private String position = "";
        private String status = "";
        private String date = "";
        private String type = "";

        public JobEntryBuilder company(String company){
            this.company = company;
            return this;
        }

        public JobEntryBuilder status(String status){
            this.status = status;
            return this;
        }

        public JobEntryBuilder type(String type){
            this.type = type;
            return this;
        }

        public JobEntryBuilder position(String position){
            this.position = position;
            return this;
        }

        public JobEntryBuilder date(String date){
            this.date = date;
            return this;
        }

        public JobEntry build(){
            JobEntry entry = new JobEntry(this);
            return entry;
        }
    }

    //JobEntry entry = new JobEntry.JobBuilder("company").position("position").status("status").type("type").build();
}