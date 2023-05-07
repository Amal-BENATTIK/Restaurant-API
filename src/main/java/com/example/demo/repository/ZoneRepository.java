package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.Zone;


public interface ZoneRepository extends JpaRepository<Zone, Integer>
{
    List<Zone> findByVilleNom(String nomVille);
   // Zone findByNomAndVilleNom(String nom, String villeNom);
    
   // List<Restaurant> findAll

}
 