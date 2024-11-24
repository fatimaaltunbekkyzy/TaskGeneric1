package genericServiceImpl;

import models.Gender;
import models.Person;
import service.GenericService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {
    private List<Person> persons = new ArrayList<>();

    @Override
    public String add(List<Person> t) {
        persons.addAll(t);
        return "person added success full";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public List<Person> sortByName() {
        persons.sort(null);
        return persons;
    }

    @Override
    public List<Person> filterByGender() {
        List<Person> filteredPersons = new ArrayList<>();
            List<Person> filteredAnimals = new ArrayList<>();
            for (Person person : persons) {
                if (person.getGender() == Gender.MALE) {
                    filteredAnimals.add(person);
                }
            }
            return filteredPersons;
        }

    @Override
    public List<Person> clear() {
        persons.clear();
        return persons;
    }
}

/* private List<Person> persons = new ArrayList<>();
    @Override
    public String add(List<Person> t) {
        persons.addAll(t);
        return "person added success full";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    @Override
    public List<Person> getAll() {
        return persons;//баардык адамдарды кайтаруу
    }

    @Override
    public List<Person> sortByName(int order) {
        Comparator<Person> personComparator = Comparator.comparing(Person::getName);
        if (order==2) {
            personComparator = personComparator.reversed();
          persons.sort(personComparator);

        }
        return persons;
    }
    @Override
    public List<Person> filterByGender(int gender) {
        for (Person p : persons) {
            if ((gender == 1 && p.getGender() == Gender.FEMALE) ||
                    (gender == 2 && p.getGender() == Gender.MALE)) {
            }
        }
        return persons;
    }
    @Override
    public List<Person> clear() {
        persons.clear();
        return persons;*/
