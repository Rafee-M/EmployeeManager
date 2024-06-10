package employeemanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Raafee-M
 */

public class TaskSaving implements TaskActions {

    @Override
    public void assignTask(String username, String taskDetails) throws UserNotFoundException {
        System.out.println("s");
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "EmployeeManager"; //default file path
        String fileName = (username + ".txt");
        if(new File(path, fileName).exists()){
            try {      
                BufferedReader reader = new BufferedReader(new FileReader(new File(path, fileName)));
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path, fileName), true));
                
                String line;
                int assignedTasks = 0;

                //reads the value of currently assigned tasks
                while ((line = reader.readLine()) != null) {
                    if (line.contains("Assigned Tasks:")) {
                        assignedTasks = Integer.parseInt(line.split(":")[1].trim());
                        System.out.println(assignedTasks);
                    }
                }

                writer.write("Task " + (assignedTasks+1) + ": " +taskDetails);
                
                writer.newLine(); // add a new line after each task
                writer.close();
                reader.close();

                // Update completed tasks count
                updateCompletedTasks(new File(path, fileName));
                updateAssignedTasks(new File(path, fileName));

            } catch (IOException ex) {
                throw new UserNotFoundException("File not found");
            }
        }
        else{
            throw new UserNotFoundException("FIle not found");
        }
    }
    
    public void updateAssignedTasks(File file) {
        try {
            File tempFile = new File(file.getParent(), "temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            //reads each line from the original file (reader.readLine()), checks if it contains the string "Assigned Tasks:"
            //if so, it updates the count, then writes the updated line to the new temporary file (writer.write(line + System.lineSeparator()))
            //same thing in updateCompletedTasks
            //string builder might be more efficient
            String line;
            while ((line = reader.readLine()) != null) {
                //check if the line contains "Assigned Tasks:"
                if (line.contains("Assigned Tasks:")) {
                    //extract the current value of Assigned Tasks and increment it
                    int assignedTasks = Integer.parseInt(line.split(":")[1].trim());
                    assignedTasks++;
                    line = "Assigned Tasks: " + assignedTasks; //update the line
                }
                writer.write(line + System.lineSeparator()); //write the line to the temporary file
            }
            reader.close();
            writer.close();

            file.delete(); //delete the original file
            tempFile.renameTo(file); //replace the original file with the temporary one

            System.out.println("Assigned Tasks updated successfully!");
        } catch (IOException e) {
            System.out.println("Error updating Assigned Tasks: " + e.getMessage());
        }
    }

    private void updateCompletedTasks(File file) {
        try {
            File tempFile = new File(file.getParent(), "temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Completed Tasks:")) {
                    int completedTasks = Integer.parseInt(line.split(":")[1].trim());
                    completedTasks++;
                    line = "Completed Tasks: " + completedTasks;
                }
                writer.write(line + System.lineSeparator());
            }
            reader.close();
            writer.close();

            //replace the original file with the temporary one
            file.delete();
            tempFile.renameTo(file);

            System.out.println("Completed Tasks updated successfully!");
        } catch (IOException e) {
            System.out.println("Error updating Completed Tasks: " + e.getMessage());
        }
    }

    @Override
    public void viewTasks(String username, boolean isAdmin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
