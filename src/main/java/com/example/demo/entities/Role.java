package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id_Role;
	
	@Column(nullable=false, length=45)
	private String nom;
	
	@ManyToMany (mappedBy = "roles", fetch = FetchType.EAGER)
	private List<User>users;
	
	
	public Role() {
		super();
		
	}
	
	

	public int getId_Role() {
		return id_Role;
	}

	public void setId_Role(int id_Role) {
		this.id_Role = id_Role;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
	
	
	
	

}
