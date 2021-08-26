package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Address;
import com.example.model.Person;

@Controller
public class ConditionalExpressionController {

	
	@GetMapping("/conditionalExpression")
	public String simpleExpression(Model model){
		Address address = new Address("Haryana","Shivji Park", "145214");
		Person amit1 = new Person(1, "Amit1", address);
		Person amit2 = new Person(2, "Amit2", null);
		model.addAttribute("person1", amit1);
		model.addAttribute("person2", amit2);
		model.addAttribute("gender","F");
		return "conditionalExpression";
	}
}
