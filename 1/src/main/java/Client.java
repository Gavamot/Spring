public class Client {



    public Client(String id, String fullName) {
        setId(id);
        setFullName(fullName);
    }

    private String id;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    private String fullName;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
