package com.insignia.interest.controller;

import com.insignia.interest.model.Interest;
import com.insignia.interest.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interest")
public class InterestController {

    @Autowired
    InterestRepository interestRepository;

    @PostMapping("/make")
    public void makeInterest(@RequestBody Interest interest){
        interestRepository.save(interest);
    }

    @GetMapping("/view")
    public Iterable<Interest> viewInterest(){
        return interestRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void removeInterest(@PathVariable Long id){
        interestRepository.deleteById(id);
    }
}
