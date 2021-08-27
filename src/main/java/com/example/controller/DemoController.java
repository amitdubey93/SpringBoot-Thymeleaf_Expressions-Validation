package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;

@RestController
public class DemoController {

	//Logger logger = LogManager.getLogger(DemoController.class);
	@GetMapping("/getAll")
	public List<Person> getData() {
//		logger.debug("appReports() method invoked in YearCodeMasterController:");
//		logger.error("wowowow............");
//		logger.info("wowowow............");
		List<Person> people = Arrays.asList(
				new Person(1, "Amit", null),
				new Person(2, "Sumit", null),
				new Person(3, "Ananya", null)
				);
		return people;
	}
}
