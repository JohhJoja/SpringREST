package com.eliseew.dima.dao;

import com.eliseew.dima.model.People;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT = 0;
    private List<People> people;
    {
        people = new ArrayList<>();
        people.add(new People("Dima", ++PEOPLE_COUNT));
        people.add(new People("Dimasik", ++PEOPLE_COUNT));
        people.add(new People("Dimachlenus", ++PEOPLE_COUNT));
        people.add(new People("Ananas", ++PEOPLE_COUNT));
        people.add(new People("Ananasik", ++PEOPLE_COUNT));
        people.add(new People("Ananachlenus", ++PEOPLE_COUNT));
    }
    public List<People> index(){
        return people;
    }
    public People show(int id){
        return people.get(id);
    }

    public void save(People people) {
        people.setId(++PEOPLE_COUNT);
        this.people.add(people);
    }
}
