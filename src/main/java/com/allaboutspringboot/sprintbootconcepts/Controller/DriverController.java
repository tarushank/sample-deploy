package com.allaboutspringboot.sprintbootconcepts.Controller;

import com.allaboutspringboot.sprintbootconcepts.Model.Driver;
import com.allaboutspringboot.sprintbootconcepts.Service.DriverServiceImpl;
import com.allaboutspringboot.sprintbootconcepts.SprintBootConceptsApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DriverController.class);

    @Autowired
    private DriverServiceImpl driverService;

    @GetMapping("/all")
    protected List<Driver> getAllDrivers() {
        LOGGER.info("Exposed the Driver list." +driverService.getAllDrivers());
        return driverService.getAllDrivers();
    }

}
