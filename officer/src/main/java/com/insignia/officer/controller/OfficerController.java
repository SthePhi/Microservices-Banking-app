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

    @GetMapping
    public List<OfficerModel> getEmployee()
    {
        return officerRepository.findAll();
    }

    @GetMapping("/employee/{employmentID}")
    public Optional<OfficerModel> getEmployee(@PathVariable int employmentID)
    {
        return officerRepository.findById(employmentID);
    }

    @DeleteMapping("/employee/{employmentID}")
    public boolean deleteEmployee(@PathVariable int employmentID)
    {
        officerRepository.deleteByemploymentID(employmentID);
        return true;
    }

    
}
