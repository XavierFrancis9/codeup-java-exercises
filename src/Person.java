public class Person {
    private String name;

    public Person () {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s", this.name);
    }


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Xavier");
        p1.sayHello();

    }
}
