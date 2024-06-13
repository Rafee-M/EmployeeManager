package employeemanager;

import java.util.List;

/**
 *
 * @author Raafee-M
 */

public interface TaskActions {

    public void assignTask(String username, String taskDetails) throws UserNotFoundException;
    public List<String> viewTasks(String username, boolean isAdmin) throws UserNotFoundException;
}

