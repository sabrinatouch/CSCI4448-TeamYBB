
public class EntryFactory {
    public Entry createEntry(String company, String position, String status, String date, String type){
        if(type == null){
            return null;
        }
        else if(type == "job"){
            return new JobEntry(company, position, status, date, type);
        }
        else if(type == "internship"){
            return new InternshipEntry(company, position, status, date, type);
        }

        return null;
    }
}