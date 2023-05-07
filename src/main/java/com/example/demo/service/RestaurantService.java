package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Restaurant;

import com.example.demo.repository.RestaurantRepository;


@Service
public class RestaurantService  implements IDao <Restaurant>{
	
	@Autowired 
	private RestaurantRepository restaurantRepository;
	

	@Override
	public Restaurant save(Restaurant r) {
		
		return restaurantRepository.save(r);

	}

	@Override
	public List<Restaurant> findAll() {
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant findById(int id_Restaurant) {
		return restaurantRepository.findById(id_Restaurant);
	}

	@Override
	public void update(Restaurant r) {
		restaurantRepository.save(r);
		
	}

	@Override
	public void delete(Restaurant r) {
		restaurantRepository.delete(r);
		
	}
	
	
	

	
	

}
