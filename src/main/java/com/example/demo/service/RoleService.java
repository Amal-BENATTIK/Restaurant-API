package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;


public class RoleService implements IDao <Role> {
	
	@Autowired 
	private RoleRepository roleRepository;

	@Override
	public Role save(Role rl) {
		
		return roleRepository.save(rl);
	}

	@Override
	public List<Role> findAll() {
		
		return roleRepository.findAll();
	}

	@Override
	public Role findById(int id_Role) {
		
		return roleRepository.findById( id_Role);
	}

	@Override
	public void update(Role rl) {
		roleRepository.save(rl);
		
	}

	@Override
	public void delete(Role rl) {
		roleRepository.delete(rl);
		
	}

}
