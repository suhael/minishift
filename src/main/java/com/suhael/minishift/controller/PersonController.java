package com.suhael.minishift.controller;

import com.suhael.minishift.model.Person;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class PersonController {

    @RequestMapping("person")
    public List<Person> getPeople() {
        return Arrays.asList(
                new Person("suhael", "akhtar"),
                new Person("eesa", "akhtar"),
                new Person("ameera", "akhtar")
        );
    }
}
