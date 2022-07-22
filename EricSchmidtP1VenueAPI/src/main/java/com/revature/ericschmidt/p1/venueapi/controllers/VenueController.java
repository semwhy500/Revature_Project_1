package com.revature.ericschmidt.p1.venueapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/getVenues")
	public List<Venue> getVenue() {
		return venueService.findAll();
	}
	
	@PostMapping("/addVenue")
	public Venue save(@RequestBody Venue venue) {
		return venueService.save(venue);
	}
	
	@GetMapping("/{VENUEID}")
	public Venue getVenueByVENUEID(@PathVariable int VENUEID) {
		return this.venueService.getVenueByVENUEID(VENUEID);
	}
	
	@DeleteMapping("/delete/{VENUEID}")
	public void delete(@PathVariable int VENUEID) {
		Venue venue = this.venueService.getVenueByVENUEID(VENUEID);
		this.venueService.delete(venue);
	}
	
}
