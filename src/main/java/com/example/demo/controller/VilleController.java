package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entities.Restaurant;

import com.example.demo.entities.Ville;
import com.example.demo.entities.Zone;
import com.example.demo.repository.RestaurantRepository;
import com.example.demo.repository.SpecialiteRepository;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.RestaurantService;
import com.example.demo.service.VilleService;

@RestController
@RequestMapping("/api/villes")
public class VilleController {

	@Autowired
	private VilleService villeService;

	@Autowired
	private ZoneRepository zoneRepository;

	@Autowired
	private SpecialiteRepository specialiteRepository;

	@Autowired
	private RestaurantRepository restaurantRepository;

	@Autowired
	private RestaurantService restaurantService;

	@GetMapping("/")
	public List<Ville> getAllVilles() {
		return villeService.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody Ville v) {
		villeService.save(v);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		villeService.delete(villeService.findById(id));
	}

	@PutMapping("/update")
	public void update(@RequestBody Ville v) {
		villeService.update(v);
	}

	@GetMapping("/{id}")
	public Restaurant findById(@PathVariable int id) {
		return restaurantService.findById(id);
	}

	@GetMapping("/{nomVille}/zones")
	public List<Zone> getAllZonesByVille(@PathVariable String nomVille) {
		Ville ville = villeService.findByNom(nomVille);
		if (ville != null) {
			return ville.getZones();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ville non trouvée");
		}

	}

	@GetMapping("/{nomVille}/zones/{nomZone}/restaurants")
	public List<Restaurant> getAllRestaurantsByZone(@PathVariable String nomVille, @PathVariable String nomZone) {
		return restaurantRepository.findAllByVilleAndZone(nomVille, nomZone);
	}

	@GetMapping("/{nomVille}/zones/{nomZone}/specialite/{nomSpecialite}/restaurants")
	public List<Restaurant> getAllRestaurantsByZoneAndVilleAndSpecialite(@PathVariable String nomVille,
			@PathVariable String nomZone, @PathVariable String nomSpecialite) {
		return restaurantRepository.findAllByVilleAndZoneAndSpecialite(nomVille, nomZone, nomSpecialite);
	}

	@GetMapping("/{nomVille}/zones/{nomZone}/serie/{nomSerie}/restaurants")
	public List<Restaurant> getAllRestaurantsByZoneAndVilleAndSerie(@PathVariable String nomVille,
			@PathVariable String nomZone, @PathVariable String nomSerie) {
		return restaurantRepository.findAllByVilleAndZoneAndSerie(nomVille, nomZone, nomSerie);
	}

}
