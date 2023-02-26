package com.final_rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.final_rest.model.Garden;
import com.final_rest.service.GardenService;

@RestController
public class Gardenontroller {

	@Autowired
	GardenService gardenService;
	
	@PostMapping("/garden")
	public String createGarden(@RequestBody Garden garden) {
		
		gardenService.createGarden(garden);
		return "garden created succssfully";
	}
	
	
	@GetMapping("/garden")
	public List<Garden> getAllDetail(){
		
		return gardenService.getAllDetail();
	}
	
	@GetMapping("/gardens")
	public List<Garden> getGardenReso(@RequestParam /* int id, */ String name) {
		
		return gardenService.getGardenReso(/* id, */ name);
	}
}
