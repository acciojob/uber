package com.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.driver.model.Cab;

@Repository
public interface CabRepository extends JpaRepository<Cab, Integer> {

}
