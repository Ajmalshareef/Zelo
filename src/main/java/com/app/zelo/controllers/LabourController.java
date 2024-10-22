package com.app.zelo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.zelo.models.Labour;
import com.app.zelo.services.LabourService;

import java.util.List;

@RestController
@RequestMapping("/zelo")
@CrossOrigin(origins = "http://localhost:3000")
public class LabourController {

    @Autowired
    private LabourService labourService;

    @GetMapping("/getAllLabours")
    public List<Labour> getAllLabours() {
        return labourService.getAllLabours();
    }
    
    @GetMapping("/getLabourById/{id}")
    public Labour getLabourById(@PathVariable int id) {
        return labourService.getLabourById(id);
    }
    
    @GetMapping("/getLatestId")
    public String getLabourById() {
        return labourService.getLatestId();
    }
    
    @GetMapping("/getLabourByName")
    public List<Labour> getCategoryName(@RequestParam String name) {
        return labourService.getAllLaboursByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLabour(@PathVariable int id) {
        labourService.deleteById(id);
    }
    
    @PostMapping("/addLabour")
    public void addLabour(@RequestBody Labour labour) {
         labourService.addLabour(labour);
    }
}