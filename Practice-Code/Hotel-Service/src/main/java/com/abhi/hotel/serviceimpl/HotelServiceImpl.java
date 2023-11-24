package com.abhi.hotel.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.hotel.entities.Hotel;
import com.abhi.hotel.exception.ResourceNotFoundException;
import com.abhi.hotel.reposetries.HotelRepository;
import com.abhi.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String randomHotelId=UUID.randomUUID().toString();
		hotel.setHotelId(randomHotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel not found with given id : "+hotelId));
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

}
