
public class InternshipEntry implements Entry{
    private String company;
    private String position;
    private String status;
    private String date;
    private String type;
    private int id;

    public InternshipEntry(String status, String date, String company, String position, String type){
        this.company = company;
        this.position = position;
        this.status = status;
        this.date = date;
        this.type = type;
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
    public void setCompany(String company){
        this.company = company;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setID(int id){
        this.id = id;
    }
}