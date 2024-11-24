package genericServiceImpl;

import models.Gender;
import models.Animal;
import service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalServiceImpl implements GenericService<Animal> {
    private List<Animal> animals = new ArrayList<>();

    @Override
    public String add(List<Animal> t) {
        animals.addAll(t);
        return "animal added success full";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal :animals) {
            if (animal.getId().equals(id)) {
                return animal;
            }}

        return null;
    }

    @Override
    public List<Animal> getAll() {
        return animals;
    }

    @Override
    public List<Animal> sortByName() {
        List<Animal> sortedList = new ArrayList<>(animals);
        animals.sort(Comparator.comparing(Animal::getName));
        return sortedList;

    }

    @Override
    public List<Animal> filterByGender() {
        List<Animal> filteredAnimals = new ArrayList<>();
            for (Animal animal : animals) {
                if (animal.getGender() == Gender.MALE) {
                    filteredAnimals.add(animal);
                }
            }
            return filteredAnimals;
    }
    @Override
    public List<Animal> clear() {
        animals.clear();
        return animals;
    }

   /* private List<Animal> animals = new ArrayList<>();
    @Override
    public String add(List<Animal> t) {
        animals.addAll(t);
        return " animal added success full";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal :animals) {
            if (animal.getId().equals(id)) {
                return animal;
            }}
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return animals;
    }

    @Override
    public List<Animal> sortByName(int order) {
        Comparator<Animal> animalComparator = Comparator.comparing(Animal::getName);
        if (order==2) {
           animalComparator = animalComparator.reversed();
            animals.sort(animalComparator);

        }

        return animals;
    }

    @Override
    public List<Animal> filterByGender(int gender) {
        for (Animal animal : animals) {
            if ((gender == 1 && animal.getGender() == Gender.FEMALE) ||
                    (gender == 2 && animal.getGender() == Gender.MALE)) {
            }
        }

        return animals;
    }

    @Override
    public List<Animal> clear() {
        animals.clear();
        return animals;

    */
    }

