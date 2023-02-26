package com.final_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.final_rest.dao.GardenDaoImpl;
import com.final_rest.model.Garden;

@Service
public class GardenServiceImpl implements GardenService{

	
	@Autowired
	GardenDaoImpl dao;
	@Override
	public Garden createGarden(Garden garden) {
		return dao.createGarden(garden);
	}
	@Override
	public List<Garden> getAllDetail() {
		return dao.getAllDetail();
	}
	@Override
	public List<Garden> getGardenReso(/* int id, */ String name) {
		return dao.getGardenReso(/* id, */ name);
	}
	
}
