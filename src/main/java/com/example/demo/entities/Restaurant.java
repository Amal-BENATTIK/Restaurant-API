package com.example.demo.entities;



import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_Restaurant;
	private String nom;
	private String adresse;
	private String latitude;
	private String longitude;
	private double rank;
	private String featured_image;
	private Date heure_ouverture;
	private Date heure_fermeture;
	private String jour_ouverture;
	
	@ManyToOne
	@JsonIgnore
	private Serie serie;
	
	@ManyToOne(fetch = FetchType.EAGER) 	
	@JsonIgnore
	private Zone zone;
	
	@ManyToMany 	
	@JsonIgnore 
	private List<Specialite>specialites;
	
	
	@ManyToMany (mappedBy = "restaurants", fetch = FetchType.EAGER) 	
	@JsonIgnore
	private List<User>users;
	
	@OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Photo> photos;
	
	public Restaurant() {
		super();
		
	}

	public int getId_Restaurant() {
		return id_Restaurant;
	}

	public void setId_Restaurant(int id_Restaurant) {
		this.id_Restaurant = id_Restaurant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public String getFeatured_image() {
		return featured_image;
	}

	public void setFeatured_image(String featured_image) {
		this.featured_image = featured_image;
	}

	public Date getHeure_ouverture() {
		return heure_ouverture;
	}

	public void setHeure_ouverture(Date heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}

	public Date getHeure_fermeture() {
		return heure_fermeture;
	}

	public void setHeure_fermeture(Date heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}

	public String getJour_ouverture() {
		return jour_ouverture;
	}

	public void setJour_ouverture(String jour_ouverture) {
		this.jour_ouverture = jour_ouverture;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public List<Specialite> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	
	

	
	
	
	
	
	
	
	
	

}