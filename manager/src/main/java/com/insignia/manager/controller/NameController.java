package com.insignia.manager.controller;

import com.insignia.manager.model.Manager;
import com.insignia.manager.model.Name;
import com.insignia.manager.repository.ManagerRepository;
import com.insignia.manager.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/manager")
public class NameController {

    @Autowired
    NameRepository nameRepository;

    @PostMapping("/sign-up")
    public void addName(Name name) {
        nameRepository.save(name);
    }

    @GetMapping("/{id}")
    public Optional<Name> viewManagerProfile(@PathVariable Long id) {
        return nameRepository.findById(id);
    }
}
