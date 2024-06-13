package employeemanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafee-M
 */
public class UsernameLedger implements InfoSaving {

    private Employee employee;
    private final String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "EmployeeManager";

    public UsernameLedger() {
    }

    ;
    
    public UsernameLedger(Employee employee) {
        this.employee = employee;
    }

    //checks if the directory exists. if not present makes one
    @Override
    public void checkDir(String path) {
        File directory = new File(path);

        if (!directory.exists()) {
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

            writer.write(this.employee.getUsername() + "\n");

            writer.close();

        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    @Override
    public void deleteInfo(String username) throws UserNotFoundException {

        String fileName = ("usernameList.txt");
        File f1 = new File(path, fileName);
        File temp = new File(path, "temp.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
            BufferedReader reader = new BufferedReader(new FileReader(f1));

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(username)) {
                    continue;
                } else {
                    writer.write(line);
                    writer.newLine();
                }
            }

            f1.delete();
            temp.renameTo(f1);

            reader.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new UserNotFoundException("Error writing to file");
        }
    }

    public boolean usernameSearch(String username) throws UserNotFoundException {
        String fileName = "usernameList.txt"; // Use the correct file name
        File f1 = new File(path, fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(f1))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(username)) {
                    return true;
                }
            }
        } 
        
        catch (IOException e) {
            System.out.println(e.getMessage());
            throw new UserNotFoundException("Error reading from file");
        }

        return false;
    }

    public List<String> getUsernames() throws UserNotFoundException {
        String fileName = ("usernameList.txt");
        List<String> usernames = new ArrayList<>();

        try {
            File f1 = new File(path, fileName);
            BufferedReader reader = new BufferedReader(new FileReader(f1));

            String line;
            while ((line = reader.readLine()) != null) {
                usernames.add(line);
            }

            reader.close();
        } catch (Exception e) {
            throw new UserNotFoundException("Error reading usernames from file: " + e.getMessage());

        }

        return usernames;
    }

}
