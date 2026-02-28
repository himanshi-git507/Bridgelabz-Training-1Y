import java.io.*;

interface Backupable extends Serializable {
}

interface SensitiveData {
}

class EmployeeRecord implements Backupable {
    private String name;
    private int id;

    public EmployeeRecord(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "EmployeeRecord{name='" + name + "', id=" + id + "}";
    }
}

class PrototypeModel implements Cloneable {
    private String modelName;

    public PrototypeModel(String modelName) {
        this.modelName = modelName;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "PrototypeModel{modelName='" + modelName + "'}";
    }
}

class UserCredentials implements SensitiveData {
    private String username;
    private String password;

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "Sensitive UserCredentials for user: " + username;
    }
}

public class MarkerInterfacesAssignment {
    public static void main(String[] args) throws Exception {

        EmployeeRecord record = new EmployeeRecord("Amit", 101);
        FileOutputStream fileOut = new FileOutputStream("backup.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(record);
        out.close();
        fileOut.close();
        System.out.println("Backup completed for: " + record);

        PrototypeModel original = new PrototypeModel("VehicleModel-X");
        PrototypeModel cloned = (PrototypeModel) original.clone();
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        UserCredentials credentials = new UserCredentials("admin", "secret123");
        if (credentials instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Apply encryption.");
        }
    }
}
