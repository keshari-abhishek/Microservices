package com.abhi.hotel.reposetries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
