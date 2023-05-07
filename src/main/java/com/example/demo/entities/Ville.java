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
public class Ville {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_Ville;
	private String nom;
	
	@OneToMany(mappedBy = "ville", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Zone> zones;
	
	public Ville() {
		super();
		
	}
	public int getId_Ville() {
		return id_Ville;
	}
	public void setId_Ville(int id_Ville) {
		this.id_Ville = id_Ville;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Zone> getZones() {
		return zones;
	}
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
	
	
	
	
	
	
	

}
