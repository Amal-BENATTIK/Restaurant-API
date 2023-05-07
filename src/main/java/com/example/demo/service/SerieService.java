package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Serie;

import com.example.demo.repository.SerieRepository;

public class SerieService implements IDao <Serie> {
	@Autowired 
	private SerieRepository serieRepository;
	@Override
	public Serie save(Serie se) {
		
		return serieRepository.save(se);
	}

	@Override
	public List<Serie> findAll() {
		
		return serieRepository.findAll();
	}

	@Override
	public Serie findById(int id_Serie) {
		
		return serieRepository.findById( id_Serie);
	}

	@Override
	public void update(Serie se) {
	   serieRepository.save(se);
		
	}

	@Override
	public void delete(Serie se) {
		   serieRepository.delete(se);
		
	}

}
