package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Photo {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_Photo;
	private String url;
	
	@ManyToOne
	@JsonIgnore
	private Restaurant restaurant;
	
	public Photo() {
		super();
		
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public int getId_Photo() {
		return id_Photo;
	}

	public void setId_Photo(int id_Photo) {
		this.id_Photo = id_Photo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

}
