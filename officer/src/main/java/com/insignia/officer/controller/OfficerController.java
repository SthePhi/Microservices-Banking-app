package com.insignia.officer.controller;

import com.insignia.officer.model.OfficerModel;
import com.insignia.officer.repository.OfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OfficerController
{
    @Autowired
    private OfficerRepository officerRepository;

    @GetMapping("/getAllOfficers")
    public Iterable<OfficerModel> getOfficer()
    {
        return officerRepository.findAll();
    }

    @GetMapping("/getOfficer/{employmentID}")
    public Optional<OfficerModel> getOfficer(@PathVariable int employmentID)
    {
        return officerRepository.findById(employmentID);
    }

    @DeleteMapping("/officer/{employmentID}")
    public void deleteOfficer(@PathVariable Integer employmentID)
    {
        officerRepository.deleteById(employmentID);
    }

    @PostMapping("/postOfficer")
    public OfficerModel createEmployee(@RequestBody OfficerModel employee)
    {
        return officerRepository.save(employee);
    }

    @PutMapping("/updateOfficer")
    public OfficerModel updateEmployee(OfficerModel employee)
    {
        return officerRepository.save(employee);
    }

}
