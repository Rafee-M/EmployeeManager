package employeemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raafee-M
 */
public class TaskViewing implements TaskActions {

    @Override
    public void assignTask(String username, String taskDetails) throws UserNotFoundException {
        //empty
    }

    @Override
    public List<String> viewTasks(String username, boolean isAdmin) throws UserNotFoundException {
        List<String> tasks = new ArrayList<>();

        if (isAdmin) {
            String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "EmployeeManager";
            String fileName = (username + ".txt");
            File f1 = new File(path, fileName);
            String line;
            boolean readStarted = false;

            if (f1.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(f1))) {
                    
                    while ((line = reader.readLine()) != null) {
                        
                        if (readStarted) {
                            tasks.add(line.trim());
                        } 
                        
                        else if (line.equals("##Tasks")) {
                            readStarted = true;
                        }
                    }
                }
                
                catch (IOException ex) {
                    System.err.println("Error reading file: " + ex.getMessage());
                    throw new UserNotFoundException("Error reading file: " + ex.getMessage());
                }
            } 
            
            else {
                throw new UserNotFoundException("File not found: " + f1.getAbsolutePath());
            }
            
            
        } 
        
        else {
            // To be completed
        }

        return tasks;
    }

}
