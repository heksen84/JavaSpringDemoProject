package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting1")
	public String greeting1(@RequestParam(name="name", required=false, defaultValue="World1") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/greeting2")
	public String greeting2(@RequestParam(name="name", required=false, defaultValue="World2") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}