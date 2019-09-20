package com.insignia.manager.controller;

import com.insignia.manager.model.Manager;
import com.insignia.manager.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Optional;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerRepository managerRepository;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody final Manager customer) {
        managerRepository.save(customer);
    }

    @GetMapping("/{id}")
    public Optional<Manager> viewManagerProfile(@PathVariable Long id){
        return managerRepository.findById(id);
    }
}
