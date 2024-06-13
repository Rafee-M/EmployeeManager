package employeemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rafee-M
 */
public class FileInfoReader {

    public Employee readUser(String username, boolean isAdmin) throws IOException {

        Employee employee = null;
        if (!isAdmin) {
            String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "EmployeeManager"; // Default file path
            String fileName = (username + ".txt");
            File f1 = new File(path, fileName);

            try (BufferedReader reader = new BufferedReader(new FileReader(f1))) {
                String line;
                String name = null, password = null, readUsername = null, position = null;
                int id = 0, age = 0, gender = 0, salary = 0;
                int completedTask = 0, assignedTask = 0;

                while ((line = reader.readLine()) != null) {
                    if (line.contains("Name")) {
                        name = line.split(":")[1].trim();
                    } 
                    else if (line.contains("Password")) {
                        password = line.split(":")[1].trim();
                    }
                    else if (line.contains("ID")) {
                        id = Integer.parseInt(line.split(":")[1].trim());
                    }
                    else if (line.contains("Username")) {
                        readUsername = line.split(":")[1].trim();
                    }
                    else if (line.contains("Age")) {
                        age = Integer.parseInt(line.split(":")[1].trim());
                    }
                    else if (line.contains("Gender")) {
                        gender = Integer.parseInt(line.split(":")[1].trim());
                    }
                    else if (line.contains("Position")) {
                        position = line.split(":")[1].trim();
                    }
                    else if (line.contains("Salary")) {
                        salary = Integer.parseInt(line.split(":")[1].trim());
                    }
                    else if (line.contains("Assigned Tasks:")) {
                        assignedTask = Integer.parseInt(line.split(":")[1].trim());   
                    
                    }
                    else if (line.contains("Completed Tasks:")) {
                        completedTask = Integer.parseInt(line.split(":")[1].trim());   
                    
                    }
                }

                employee = new Employee(name, readUsername, password, id, age, gender, position, salary);
                employee.setCompletedTask(completedTask);
                employee.setAssignedTask(assignedTask);
                
                return employee;
                
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }
        
        else{
            
        }
        return null;
    }
}
