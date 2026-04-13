import java.util.*;
import java.util.stream.*;

class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    // Static method for filtering
    public static boolean isOlderThanLimit(Person p, int ageLimit) {
        return p.getAge() > ageLimit;
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of people: ");
        int n = sc.nextInt();

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            persons.add(new Person(sc.next(), sc.nextInt()));
        }

        System.out.print("Enter age limit: ");
        int ageLimit = sc.nextInt();

        // 1. Sort names alphabetically
        // Person::getName is a reference to an instance method of an arbitrary object
        System.out.print("Sorted Names: ");
        persons.stream()
                .map(Person::getName) 
                .sorted(String::compareTo) 
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 2. Filter using static logic
        // Note: Can't use :: here easily because of the extra 'ageLimit' parameter
        System.out.print("Older than " + ageLimit + ": ");
        persons.stream()
                .filter(p -> Person.isOlderThanLimit(p, ageLimit)) 
                .map(Person::getName)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 3. Instance method reference on a specific type
        System.out.print("Uppercase: ");
        persons.stream()
                .map(Person::getName)
                .map(String::toUpperCase) 
                .forEach(name -> System.out.print(name + " "));
        
        sc.close();
    }
}