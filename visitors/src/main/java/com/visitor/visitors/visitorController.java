package com.visitor.visitors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3001/")
public class visitorController {

    @Autowired
    visitorserviceImple service;

    @GetMapping("visitor")
    public List<Visitor> getVisitor() {
        return service.readVisitors();
    }

    @GetMapping("visitor/{id}")
    public Visitor getVisitorById(@PathVariable int id) {
        return service.readVisitor(id);
    }

    // @GetMapping("visitor/{name}")
    // public Visitor getVisitorByName(@PathVariable String name) {
    // return service.getVisitorByName(name);
    // }

    @PostMapping("visitor")
    public String visitor(@RequestBody Visitor v) {
        return service.createVisitor(v);
    }

    @DeleteMapping("visitor/{id}")
    public String deleteVisitor(@PathVariable int id) {
        if (service.deleteVisitor(id)) {
            return "visitor deleted";
        }
        return "visitor not deleted";

    }

    @PutMapping("visitor/{id}")
    public String updateVisitor(@PathVariable int id, @RequestBody Visitor v) {
        return service.updateVisitor(id, v);

    }
}
