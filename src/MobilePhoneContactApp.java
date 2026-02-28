class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void display() {
        System.out.println(String.format("Name: %s, Phone: %s", name, phoneNumber));
    }
}

class BusinessContact extends Contact {
    String companyName;

    BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    void display() {
        System.out.println(String.format("Name: %s, Phone: %s, Company: %s",
                name.toUpperCase(), phoneNumber, companyName));
    }
}

public class MobilePhoneContactApp {
    public static void main(String[] args) {
        Contact c1 = new Contact("Himanshi", "9876543210");
        Contact c2 = new BusinessContact("Rahul", "9123456780", "TechCorp");

        c1.display();
        c2.display();
    }
}
