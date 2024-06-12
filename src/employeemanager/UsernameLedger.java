package employeemanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Rafee-M
 */

public class UsernameLedger implements InfoSaving{

    private Employee employee;
    private final String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "EmployeeManager";
    
    public UsernameLedger(Employee employee){
        this.employee = employee;
    }
    

    //checks if the directory exists. if not present makes one
    @Override
    public void checkDir(String path) {
        File directory = new File(path);
        
        if(!directory.exists()){
            directory.mkdirs();
        }
    }
    
    //just makes a list of usernames in usernameList.txt
    @Override
    public void saveToFile() {
        
        String fileName = ("usernameList.txt");
        File f1 = new File(path, fileName);
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f1, true));

            writer.write(employee.getUsername() + "\n");

            writer.close();

        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    
}
