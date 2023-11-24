package com.abhi.hotel.service;

import java.util.List;

import com.abhi.hotel.entities.Hotel;

public interface HotelService {
	
	public Hotel saveHotel(Hotel hotel);
	
	public Hotel getHotelById(String hotelId);
	
	public List<Hotel> getAllHotel();

}
