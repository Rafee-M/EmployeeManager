package employeemanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Rafee-M
 */

public class EmployeeSaving implements InfoSaving {

    private Employee employee;
    private int flag = 0;
    private final String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "EmployeeManager";

    public EmployeeSaving(Employee employee) {

        this.employee = employee;
    }
    
    @Override
    public void checkDir(String path){
        File directory = new File(path);

        //check directory existence before moving to file saving
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    @Override
    public void saveToFile() {

        checkDir(path);
        
        String fileName = (employee.getUsername() + ".txt");
        File f1 = new File(path, fileName);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f1));

            writer.write("Name: " + employee.getName() + "\n");
            writer.write("Password: " + employee.getPassword() + "\n");
            writer.write("ID: " + employee.getId() + "\n");
            writer.write("Username: " + employee.getUsername() + "\n");
            writer.write("Age: " + employee.getAge() + "\n");

            String gender = (employee.getGender() == 0) ? "Male" : "Female";
            writer.write("Gender: " + employee.getGender() + "\n");

            String userType = (employee.getIsAdmin()) ? "Admin" : "Employee";
            writer.write("User Type: " + employee.getIsAdmin() + "\n");

            writer.write("Position: " + employee.getPosition() + "\n");
            writer.write("Salary: " + employee.getSalary() + "\n");
            writer.write("Assigned Tasks: 0\n");
            writer.write("Completed Tasks: 0\n\n");
            writer.write("##Tasks\n");

            writer.close();

        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
