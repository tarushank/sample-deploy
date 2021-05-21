package com.allaboutspringboot.sprintbootconcepts.Service;

import com.allaboutspringboot.sprintbootconcepts.Model.Driver;
import com.allaboutspringboot.sprintbootconcepts.Repository.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl {

    @Autowired
    private DriverRepo driverRepo;

    // Fetch and return list of all Drivers.
    public List<Driver> getAllDrivers() {
        return driverRepo.findAll();
    }
}
