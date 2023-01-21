package com.driver.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripBookingRepository extends JpaRepository<TripBooking, Integer>{

}
