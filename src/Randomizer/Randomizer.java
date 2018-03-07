package Randomizer;

import java.util.Scanner;

public class Randomizer {

    public static void main(String[] args) {
        String[] names = {"John", "Paul", "George", "Ringo"};
        String[] otherNames = {"Jimmy", "Robert", "John", "John Paul Jones"};

        // specifies an array of people objects
        Person[] people = new Person[names.length + otherNames.length];

        // instantiate students and add to people array
        for(int i = 0; i < names.length; i++) {
            // populating the people array w/ student objects
            people[i] = new Student(names[i]);
        }

        for(int i = 0; i < otherNames.length; i++) {
            people[i + 4] = new Customer(otherNames[i]);
        }

        Person random;
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            random = getRandom(people);
            random.call();
            System.out.println(random.getName() + " has been called " + random.getNumberOfTimesCalled() + " time.");
            System.out.println("Do you want to call another student? Type 'y' for yes.");
            answer = scan.next();
        } while(answer.equalsIgnoreCase("y"));

        showOutput(people);
    }

    public static Person getRandom(Person[] people) {
        int randomNum = (int) Math.floor(Math.random() * people.length);
        return people[randomNum];

    }

    public static void showOutput(Person[] people) {
        for(Person person: people) {
            System.out.println(person.getName() + " is a " + person.getType() + " and was called a total of " + person.getNumberOfTimesCalled() + " times.");
        }
    }

}
