public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method for testing
    public static void main(String[] args) {
        Person person1 = new Person("shanaka", 30);
        Person person2 = new Person("prince", 25);

        System.out.println("Person 1: Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2: Name: " + person2.getName() + ", Age: " + person2.getAge());

    }
}
