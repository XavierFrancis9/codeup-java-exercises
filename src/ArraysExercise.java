import java.util.Arrays;


public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];

        persons[0] = new Person("John");
        persons[1] = new Person("Bob");
        persons[2] = new Person("Joe");

        Person newPerson = new Person("Jeff");
        persons = addPerson(persons, newPerson);

        for (Person person : persons) {
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] persons, Person newPerson) {
        Person[] updatedPersons = Arrays.copyOf(persons, persons.length + 1);
        updatedPersons[persons.length] = newPerson;
        return updatedPersons;
    }


}

