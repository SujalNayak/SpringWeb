package com.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CalcBean;
import com.bean.UserBean;

import jakarta.websocket.Decoder.Binary;

@Controller
public class CalcController {
	@GetMapping("/calc")
	public String calc() {
		System.out.println("calc()");
		return "Calc";
	}
	
	@PostMapping("/savenumber")
	public String saveUser(@jakarta.validation.Valid  @ModelAttribute("calc") CalcBean calc, BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			return "Calc";}
		else {
		System.out.println(calc.getNo());
		
		
		model.addAttribute("calc",calc);
		return "CalcResult";
		}
}
}
