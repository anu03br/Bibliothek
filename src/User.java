//importing needed modules

//This is a Model Class
public class User {
    private String name;
    private int userId;

    //constructor for User object
    public User(String Name, int userId) {
        this.name = Name;
        this.userId = userId;
    }
    //getters only because these attributes are treated ass immutable for simplicity's sake
    public String getName() {
        return name;
    }
    public int getUserId() {
        return userId;
    }


}
