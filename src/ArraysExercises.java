import java.lang.reflect.Array;
import java.util.Arrays;


public class ArraysExercises {

    public static Person[] addPerson(Person[] persons, Person person) {
//        Person person = new Person(name);
        Person[] copyPersons = Arrays.copyOf(persons, persons.length+1);
        copyPersons[copyPersons.length - 1] = person;
        return copyPersons;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //prints reference in stored memory

        Person[] persons = new Person[3];

        persons[0] = new Person("Cory");
        persons[1] = new Person("James");
        persons[2] = new Person("Sam");

        for (Person person : persons) {
            System.out.println(person.getName());
        };

        //Person[] newArray = addPerson(persons, new Person("Steve"));

//        for (Person aPerson : newArray) {
//            System.out.println(aPerson.getName());
//        }

        for (Person newPersons: addPerson(persons, new Person("Steve"))) {
            System.out.print(newPersons.getName() + " ");
        }
    }

    }

