class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee {
    // Override display()
    void display() {
        System.out.println("Name of class is Engineer");
        super.display(); // call parent method
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Create object
        Engineer obj = new Engineer();
        
        // Call method
        obj.display();
    }
}
