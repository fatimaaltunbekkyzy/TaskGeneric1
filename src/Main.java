import models.Gender;
import genericServiceImpl.AnimalServiceImpl;
import genericServiceImpl.PersonServiceImpl;
import models.Animal;
import models.Person;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1L, "Alice", 25, Gender.FEMALE);
        Person person2 = new Person(2L, "Bob", 30, Gender.MALE);

        Animal animal1 = new Animal(1L, "Lion", 5, Gender.MALE);
        Animal animal2 = new Animal(2L, "Elephant", 10, Gender.FEMALE);


        PersonServiceImpl personService = new PersonServiceImpl();
        AnimalServiceImpl animalService = new AnimalServiceImpl();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("варинтты танданыз: ");
            System.out.println("1. add person");
            System.out.println("2. Get By Id ");
            System.out.println("3. Get all ");
            System.out.println("4. sort by name");
            System.out.println("5. filterByGender");
            System.out.println("6: clear person");
            System.out.println("7. add Animal");
            System.out.println("8. Get By Id Animal");
            System.out.println("9. Get all Animal ");
            System.out.println("10. sort by name Animal");
            System.out.println("11. filterByGender Animal");
            System.out.println("12: clear person Animal");
            System.out.println("13. Exit");

            int choice = scanner.nextInt();
switch (choice){
    case 1-> System.out.println(personService.add(Arrays.asList(person1, person2)));
    case 2-> System.out.println(personService.getById(2L));
    case 3-> System.out.println(personService.getAll());
    case 4-> System.out.println(personService.sortByName());
    case 5-> System.out.println(personService.filterByGender());
    case 6-> System.out.println(personService.clear());
    case 7-> System.out.println(animalService.add(Arrays.asList(animal1,animal2)));
    case 8-> System.out.println(animalService.getById(2L));
    case 9-> System.out.println(animalService.getAll());
    case 10-> System.out.println(animalService.sortByName());
    case 11-> System.out.println(animalService.filterByGender());
    case 12-> System.out.println(animalService.clear());
    case 13->{
        return;
    }}
}}}
