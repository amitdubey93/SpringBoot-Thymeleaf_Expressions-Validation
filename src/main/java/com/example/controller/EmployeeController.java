package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/addEmp")
	public String addEmp(@ModelAttribute("emp") Employee emp) {
		System.out.println(emp);
		System.out.println("Hello from add emp");
		return "addEmp";
	}

	@PostMapping("/addEmp")
	public String saveEmp(@Valid @ModelAttribute("emp") Employee emp, BindingResult result ,RedirectAttributes ra) { // save to DB
		if(result.hasErrors()) {
			return "addEmp";
		}
		System.out.println(result.hasErrors());
		System.out.println("savedEmployee" + emp);
		ra.addFlashAttribute("savedEmployee", emp);
		return "redirect:/detail";
	}

	/*
	 * @PostMapping("/addEmp") public String saveEmp(@ModelAttribute("emp") Employee
	 * emp1, Model model) { // save to DB //
	 * System.out.println("savedEmployee"+emp1); model.addAttribute("savedEmployee",
	 * emp1); return "empdetail"; }
	 */

	@GetMapping("/detail")
	public String detail() {
		return "empDetail";
	}
}
