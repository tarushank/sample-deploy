package com.allaboutspringboot.sprintbootconcepts.Repository;

import com.allaboutspringboot.sprintbootconcepts.Model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver, Integer> {

}
