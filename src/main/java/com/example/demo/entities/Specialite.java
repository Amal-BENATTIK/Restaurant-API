package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Specialite {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_Specialite;
	
	private String nom;
	
	@ManyToMany (mappedBy = "specialites", fetch = FetchType.EAGER)
	private List<Restaurant>restaurants;
	
	public Specialite() {
		super();
		
	}

	public int getId_Specialite() {
		return id_Specialite;
	}

	public void setId_Specialite(int id_Specialite) {
		this.id_Specialite = id_Specialite;
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
