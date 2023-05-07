package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Zone;

import com.example.demo.repository.ZoneRepository;


@Service
public class ZoneService implements IDao <Zone>{

	
	@Autowired 
	ZoneRepository zonerepository;
	
	@Override
	public Zone save(Zone z) {
		
		return zonerepository.save(z);
	}

	@Override
	public List<Zone> findAll() {
		
		return zonerepository.findAll();
	}

	@Override
	public Zone findById(int id) {
		
		return zonerepository.findById(id).get();
	}

	@Override
	public void update(Zone z) {
		zonerepository.delete(z);
		
	}

	@Override
	public void delete(Zone z) {
		zonerepository.delete(z);
		
	}

}
