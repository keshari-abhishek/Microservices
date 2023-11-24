package com.abhi.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.hotel.entities.Hotel;
import com.abhi.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/save")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		Hotel savedHotel=hotelService.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedHotel);
	}
	
	@GetMapping("/by-id/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
		Hotel hotel=hotelService.getHotelById(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}
	
	@GetMapping("/get-all")
	public ResponseEntity<List<Hotel>> getAllHotel(){
		List<Hotel> hotels=hotelService.getAllHotel();
		return ResponseEntity.status(HttpStatus.OK).body(hotels);
	}

}
