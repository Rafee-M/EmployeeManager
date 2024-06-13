package employeemanager;

/**
 *
 * @author Rafee-M
 */

public class User {
    private String username;
    private String password;
    private boolean isAdmin;
    
    
    public User(String name, String password, boolean isAdmin){
        
        name = name.toLowerCase().replace(" ", "_"); //converts name to username, 
        
        this.username = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    
    //Getters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }
    
    
    //Setters

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Not needed yet as multiple admins dont exist yet
//    public void setIsAdmin(boolean isAdmin) {
//        this.isAdmin = isAdmin;
//    }
    
    
}
