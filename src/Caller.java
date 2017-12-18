public class Caller {
    private String name;
    private int id;
    private static int nextid=0;
    
    public Caller(String name){
        this.name=name;
        nextid++;
        id=nextid;
        
    }
    public String tostring(){
        return "Caller " + id + "\tName: " + name;
        
    }
}
