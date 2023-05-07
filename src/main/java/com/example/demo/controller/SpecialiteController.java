package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Specialite;
import com.example.demo.service.SpecialiteService;


@CrossOrigin
@RestController
@RequestMapping("/api/specialites")
public class SpecialiteController {

	@Autowired
	private SpecialiteService specialiteService;
	
	
	@GetMapping("")
	public List<Specialite> getAllSpecialtes() {
		return specialiteService.findAll();
	}

	@PostMapping("")
	public void save(@RequestBody Specialite s) {
		specialiteService.save(s);
	}
	
	
	@PutMapping("/{id}")
    public Specialite update(@PathVariable Integer id, @RequestBody Specialite s) {
		Specialite existingCity = specialiteService.findById(id);
        if (existingCity != null) {
            //existingCity.setName(city.getName());
            return specialiteService.save(existingCity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
    	specialiteService.delete(id);
    }
	
	

}
