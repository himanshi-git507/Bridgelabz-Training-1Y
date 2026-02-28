public class Base {

    public void publicMethod() {
        System.out.println("Public method accessed");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }

    void defaultMethod() {
        System.out.println("Default method accessed");
    }

    private void privateMethod() {
        System.out.println("Private method accessed");
    }
}



    public void testAccess() {
        publicMethod();
        protectedMethod();
        System.out.println("Default method not accessible in different package");
        System.out.println("Private method not accessible outside Base class");
    }
}

Main.java
import com.access.two.Derived;

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();
    }
}

