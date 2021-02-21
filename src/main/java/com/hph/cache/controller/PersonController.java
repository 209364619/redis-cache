package com.hph.cache.controller;

import com.hph.cache.entity.People;
import com.hph.cache.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    PeopleService peopleService;

    @PostMapping()
    public People insert(@RequestBody People people){
        return peopleService.updateSert(people);
    }

    @GetMapping("/{id}")
    public People selectPeopleById(@PathVariable(value = "id") Integer id){
        return peopleService.selectPeopleById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable(value = "id") Integer id){
        return peopleService.deleteById(id);
    }
}
