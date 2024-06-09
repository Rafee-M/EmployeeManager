package employeemanager;

/**
 *
 * @author Raafee-M
 */

public class Employee extends User implements TaskActions {
    
    private String name;
    private int id;
    private int age;
    private int gender; //0 == male, 1 == female. Maybe add other genders in the future
    private String position;
    private int salary;

    public Employee(String name, int id, int age, int gender, String position, int salary, String username, String password) {
        super(username, password, false);
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }
    
    //Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void assignTask(String username, String taskDetails) throws UserNotFoundException {
        //empty
    }

    @Override
    public void viewTasks(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
