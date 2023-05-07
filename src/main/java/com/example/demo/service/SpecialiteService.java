package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Specialite;
import com.example.demo.repository.SpecialiteRepository;
@Service
public class SpecialiteService implements IDao<Specialite> {
    @Autowired SpecialiteRepository specialiteRepository;

	@Override
	public Specialite save(Specialite s) {
		
		return this.specialiteRepository.save(s);
	}

	@Override
	public List<Specialite> findAll() {
		
		return this.specialiteRepository.findAll();
	}

	@Override
	public Specialite findById(int id) {
		
		return  specialiteRepository.findById(id).get();
	}

	@Override
	public void update(Specialite s) {
		specialiteRepository.save(s);
		
	}

	public void delete(Integer id) {
		specialiteRepository.deleteById(id);
		
	}

	@Override
	public void delete(Specialite o) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
