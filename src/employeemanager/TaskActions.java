package employeemanager;

/**
 *
 * @author Raafee-M
 */

public interface TaskActions {

    public void assignTask(String username, String taskDetails) throws UserNotFoundException;
    public void viewTasks(String username, boolean isAdmin);
}

