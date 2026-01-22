package se.iths.stefan.ovningspringboot.service;

import org.springframework.stereotype.Service;
import se.iths.stefan.ovningspringboot.model.Person;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public List<Person> personList() {
        ArrayList<Person> personList = new ArrayList<>();
        Person person1 = new Person(1, "Steffe", 20, "Stefan@Villegas.se");
        Person person2 = new Person(2, "Adam", 22, "Adam@Hussein.se");
        personList.add(person1);
        personList.add(person2);
        return personList;
    }

}
