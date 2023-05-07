package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_User;
	
	@Column(name= "nom" ,nullable=false, length=20)
	private String nom;
	
	@Column(name ="prenom", nullable=false, length=20 )
	private String Prenom;
	
	@Column(nullable = false, unique = true, length = 20)
	private String telephone;
	
	@Column(nullable=false, length=64)
	private String password;
	
	@Column(nullable=false, unique=true, length=45)
	private String email;
	
	@ManyToMany
	private List<Role>roles;
	
	@ManyToMany
	private List<Restaurant>restaurants;
	
	
	public User() {
		super();
		
	}

	public int getId_User() {
		return id_User;
	}
	
	
	

	public void setId_User(int id_User) {
		this.id_User = id_User;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
	
	
	
	

}
