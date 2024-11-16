package packageA;

class Parent {
    public static void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Child class display method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();

        p.display(); // Calls Parent's display method
        c.display(); // Calls Parent's display method (method hiding)
    }
}
