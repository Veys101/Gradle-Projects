/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package productjavaprojects;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Product p = new Product("Pc", "Notebook", 1999.99f);
        System.out.println("Name: " + p.getName());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Price : " + p.getPrice());
    }
}
