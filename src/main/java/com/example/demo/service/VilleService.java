package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Ville;
import com.example.demo.repository.VilleRepository;

@Service
public class VilleService  implements IDao <Ville>{
	@Autowired 
	private VilleRepository villeRepository;
	
	@Override
	public Ville save(Ville v) {
		
		return villeRepository.save(v);
	}

	@Override
	public List<Ville> findAll() {
		
		return villeRepository.findAll();
	}

	@Override
	public Ville findById(int id) {
		
		return villeRepository.findById(id).get();
	}

	@Override
	public void update(Ville v) {
		villeRepository.save(v);
		
	}

	@Override
	public void delete(Ville v) {
		villeRepository.delete(v);
		
	}

	public Ville findByNom(String nomVille) {
		
		return villeRepository.findByNom(nomVille);
	}

	
	
	

}
