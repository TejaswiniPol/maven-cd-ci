package com.springboot.controllers;

import com.springboot.model.CovidData;
import com.springboot.service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CovidController {
	
	@Autowired
	CovidService covidService;
	
	@GetMapping(value="/raw/canada")
	public List<CovidData> getCovidCanadaData() {
		return covidService.getCovidData();
	}

	@GetMapping(value="/covid/canada")
	public ModelAndView  getCovidCanadaData(Model model) {
		List<CovidData> covidData = covidService.getCovidData();

		model.addAttribute("jhCovidData", covidData);
		model.addAttribute("country", covidData.get(0).getCombined_name());
		model.addAttribute("population", covidData.get(0).getPopulation());

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("data.html");
		return modelAndView;
	}
}

