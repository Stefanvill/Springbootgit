package se.iths.stefan.ovningspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.stefan.ovningspringboot.model.Person;
import se.iths.stefan.ovningspringboot.service.PersonService;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String getPersons(Model model) {
        List<Person> personList = personService.personList();
        model.addAttribute("personer", personList);
        return "person";
    }
}
