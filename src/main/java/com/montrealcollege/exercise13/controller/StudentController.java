package com.montrealcollege.exercise13.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.montrealcollege.exercise13.model.Student;

@Controller
public class StudentController {

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentForm";
	}

	@PostMapping("/createStudent")
	public String createStudent(@Valid @ModelAttribute("student") Student std, BindingResult br, Model model) {
//		System.out.println("normal errors: "+br.hasErrors()+" "+ br.toString());
		if (br.hasErrors()) {
			return "studentForm";
		} else {
			model.addAttribute("name", std.getFirstName() + " " + std.getLastName());
			model.addAttribute("age", std.getAge());
			model.addAttribute("phone", std.getPhoneNumber());
			model.addAttribute("address", std.getAddress());
			return "result";
		}
	}

}
