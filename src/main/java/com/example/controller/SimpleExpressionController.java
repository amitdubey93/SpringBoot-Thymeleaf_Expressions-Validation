package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Address;
import com.example.model.Person;

@Controller
public class SimpleExpressionController {

	@GetMapping("/simpleExpression")
	public String simpleExpression(Model model){
		Address address = new Address("Haryana", "Shivji Park","145214");
		Person amit = new Person(1, "Amit", address);
		model.addAttribute("person", amit);
		return "simpleExpression";
	}
	
}
