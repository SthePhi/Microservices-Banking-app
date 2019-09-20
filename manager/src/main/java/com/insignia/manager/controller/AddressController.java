package com.insignia.manager.controller;

import com.insignia.manager.model.Address;
import com.insignia.manager.model.Manager;
import com.insignia.manager.model.Name;
import com.insignia.manager.repository.AddressRepository;
import com.insignia.manager.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/manager")
public class AddressController {
    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/sign-up")
    public void addName(Address address) {
        addressRepository.save(address);
    }

    @GetMapping("/{id}")
    public Optional<Address> viewManagerProfile(@PathVariable Long id) {
        return addressRepository.findById(id);
    }
}
