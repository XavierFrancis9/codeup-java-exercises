public class Person {
    private String name;

    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s", this.name);
    }


    public static void main(String[] args) {
        Person p1 = new Person("Xavier");
        p1.sayHello();

    }
}
