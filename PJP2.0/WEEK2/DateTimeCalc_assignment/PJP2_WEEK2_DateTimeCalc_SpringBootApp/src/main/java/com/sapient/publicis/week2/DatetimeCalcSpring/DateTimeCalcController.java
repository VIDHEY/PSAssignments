package com.sapient.publicis.week2.DatetimeCalcSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DateTimeCalcController {
	
	@Autowired
	DateTimeCalcService calcService;
	
	@GetMapping("/")
	public String displayOperations()
	{
		return "index";
	}
	
	@GetMapping("/addNDays")
	public String addNDays()
	{
		return "addNDays";
	}
	
	@PostMapping("/addNDays")
	public String addNDays(ModelMap model,@RequestParam(name = "date") String date,@RequestParam(name = "numOfDays") String numOfDays)
	{
		String result = calcService.addNDays(date, numOfDays);
		model.addAttribute("result",result);
		return "addNDays";
	}
	
	@GetMapping("/addNWeeks")
	public String addNWeeks()
	{
		return "addNWeeks";
	}
	
	@PostMapping("/addNWeeks")
	public String addNWeeks(ModelMap model,@RequestParam(name = "date") String date,@RequestParam(name = "numOfWeeks") String numOfWeeks)
	{
		String result = calcService.addNWeeks(date, numOfWeeks);
	 	model.addAttribute("result",result);
		return "addNWeeks";
	}
	
	@GetMapping("/addNMonths")
	public String addNMonths()
	{
		return "addNMonths";
	}
	
	@PostMapping("/addNMonths")
	public String addNMonths(ModelMap model,@RequestParam(name = "date") String date,@RequestParam(name = "numOfMonths") String numOfMonths)
	{
		String result = calcService.addNMonths(date, numOfMonths);
	 	model.addAttribute("result",result);
		return "addNMonths";
	}
	
	@GetMapping("/subtractNDays")
	public String subtractNDays()
	{
		return "subtractNDays";
	}
	
	@PostMapping("/subtractNDays")
	public String subtractNDays(ModelMap model,@RequestParam(name = "date") String date,@RequestParam(name = "numOfDays") String numOfDays)
	{
		String result = calcService.subtractNDays(date, numOfDays);
	 	model.addAttribute("result",result);
		return "subtractNDays";
	}
	
	@GetMapping("/subtractNWeeks")
	public String subtractNWeeks()
	{
		return "subtractNWeeks";
	}
	
	@PostMapping("/subtractNWeeks")
	public String subtractNWeeks(ModelMap model,@RequestParam(name = "date") String date,@RequestParam(name = "numOfWeeks") String numOfWeeks)
	{
		String result = calcService.subtractNWeeks(date, numOfWeeks);
	 	model.addAttribute("result",result);
		return "subtractNWeeks";
	}
	
	@GetMapping("/subtractNMonths")
	public String subtractNMonths()
	{
		return "subtractNMonths";
	}
	
	@PostMapping("/subtractNMonths")
	public String subtractNMonths(ModelMap model,@RequestParam(name = "date") String date,@RequestParam(name = "numOfMonths") String numOfMonths)
	{
		String result = calcService.subtractNMonths(date, numOfMonths);
	 	model.addAttribute("result",result);
		return "subtractNMonths";
	}
	
	@GetMapping("/dayOfWeek")
	public String dayOfWeek()
	{
		return "dayOfWeek";
	}
	
	@PostMapping("/dayOfWeek")
	public String dayOfWeek(ModelMap model,@RequestParam(name = "date") String date)
	{
		String result = calcService.getDayOfWeek(date);
	 	model.addAttribute("result",result);
		return "dayOfWeek";
	}
	
	@GetMapping("/weekOfYear")
	public String weekOfYear()
	{
		return "weekOfYear";
	}
	
	@PostMapping("/weekOfYear")
	public String weekOfYear(ModelMap model,@RequestParam(name = "date") String date)
	{
		String result = calcService.getWeeknumOfYear(date);
	 	model.addAttribute("result",result);
		return "dayOfWeek";
	}
	
}
