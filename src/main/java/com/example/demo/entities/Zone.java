package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Zone {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_Zone;
	private String nom;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	private Ville ville;
	
	@OneToMany(mappedBy = "zone", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Restaurant> restaurants;
	
	public Zone() {
		super();
		
	}

	public int getId_Zone() {
		return id_Zone;
	}

	public void setId_Zone(int id_Zone) {
		this.id_Zone = id_Zone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	


	
	
	
	
	

}
