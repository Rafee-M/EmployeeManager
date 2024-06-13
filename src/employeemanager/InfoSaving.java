package employeemanager;

/**
 *
 * @author Rafee-M
 */

public interface InfoSaving {
    
    public abstract void saveToFile();
    public abstract void checkDir(String path);
    public abstract void deleteInfo(String username) throws UserNotFoundException;
    
}
