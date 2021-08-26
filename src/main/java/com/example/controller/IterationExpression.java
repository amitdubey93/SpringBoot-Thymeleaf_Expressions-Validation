package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Person;

@Controller
public class IterationExpression {
	@GetMapping("/iterationExpression")
	public String iterationExpression(Model model) {
		List<Person> people = Arrays.asList(
				new Person(1, "Amit", null),
				new Person(2, "Sumit", null),
				new Person(3, "Ananya", null)
				);
		model.addAttribute("people",people);
		return "iterationExpression";
	}
}
