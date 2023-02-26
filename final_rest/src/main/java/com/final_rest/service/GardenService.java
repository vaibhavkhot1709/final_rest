package com.final_rest.service;

import java.util.List;

import com.final_rest.model.Garden;

public interface GardenService {

	public  Garden createGarden(Garden garden);

	public List<Garden> getAllDetail();

	public List<Garden> getGardenReso(/* int id, */String name);

}
