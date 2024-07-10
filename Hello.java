public class Hello {
    public static void main(String[] args) {
        // Prints the classic "Hello, World!" message
        System.out.println("Hello, World!");
        greet("Student");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}