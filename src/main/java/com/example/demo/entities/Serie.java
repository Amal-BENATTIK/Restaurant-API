package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Serie {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_Serie;
	private String nom;
	
	@OneToMany(mappedBy = "serie", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Restaurant> restaurants;
	
	public Serie() {
		super();
		
	}

	public int getId_Serie() {
		return id_Serie;
	}

	public void setId_Serie(int id_Serie) {
		this.id_Serie = id_Serie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	
	
	
	
	
	
	

}
