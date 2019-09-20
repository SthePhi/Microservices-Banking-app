package com.insignia.officer.controller;

import com.insignia.officer.model.OfficerModel;
import com.insignia.officer.repository.OfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OfficerController
{
    @Autowired
    private OfficerRepository officerRepository;

    @GetMapping("/getAllOfficers")
    public Iterable<OfficerModel> getEmployee()
    {
        return officerRepository.findAll();
    }

    @GetMapping("/getOfficer/{employmentID}")
    public Optional<OfficerModel> getEmployee(@PathVariable int employmentID)
    {
        return officerRepository.findById(employmentID);
    }

    /*
    @DeleteMapping(value = "/deleteOfficer/{employmentID}")
    public boolean deleteEmployee(@PathVariable int employmentID)
    {
        officerRepository.deleteByemploymentID(employmentID);
        return true;
    }
    */
    @CrossOrigin(origins="http://localhost:9022", allowedHeaders = "*")
    @DeleteMapping("/deleteOfficer/{employmentID}")
    public void DeleteOfficer(@PathVariable int employmentID)
    {
        officerRepository.deleteByEmploymentID(employmentID);
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
