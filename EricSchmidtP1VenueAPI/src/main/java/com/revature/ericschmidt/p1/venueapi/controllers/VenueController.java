package com.revature.ericschmidt.p1.venueapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ericschmidt.p1.venueapi.model.Venue;
import com.revature.ericschmidt.p1.venueapi.service.VenueService;

@RestController
@RequestMapping("/venues")
public class VenueController {

	@Autowired
	private VenueService venueService;

	@GetMapping("/getvenues")
	public List<Venue> getVenue() {
		return venueService.findAll();
	}
	
	@PostMapping("/addvenue")
	public Venue save(@RequestBody Venue venue) {
		return venueService.save(venue);
	}
	
}
