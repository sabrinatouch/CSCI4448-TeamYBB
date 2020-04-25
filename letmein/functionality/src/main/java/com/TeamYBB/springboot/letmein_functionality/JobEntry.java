package com.TeamYBB.springboot.letmein_functionality;

//EXAMPLE OF BUILDER PATTERN HERE.
public class JobEntry implements Entry{
    // Change order of variables as displayed. Can do later.
    private String company;
    private String position;
    private String status;
    private String date;
    private String type;
    private int id;

    private JobEntry(JobBuilder builder){
        this.company = builder.company;
        this.position = builder.position;
        this.status = builder.status;
        this.date = builder.date;
        this.type = builder.type;
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

    public static class JobBuilder{
        private String company;
        private String position;
        private String status;
        private String date;
        private String type;

        public JobBuilder(String company){
            this.company = company;
        }

        public JobBuilder position(String position){
            this.position = position;
            return this;
        }

        public JobBuilder status(String status){
            this.status = status;
            return this;
        }

        public JobBuilder date(String date){
            this.date = date;
            return this;
        }

        public JobBuilder type(String type){
            this.type = type;
            return this;
        }

        public JobEntry build(){
            JobEntry entry = new JobEntry(this);
            return entry;
        }
    }

    //JobEntry entry = new JobEntry.JobBuilder("company").position("position").status("status").type("type").build();
}