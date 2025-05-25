package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stdService;
	
	@PostMapping("/addstd")
	public Student add(@RequestBody Student s1)
	{
	  return stdService.insert(s1);
	}
	
	@GetMapping("/allstd")
	public List<Student> getall()
	{
		return stdService.getallstd();
	}
	
	@GetMapping("/getstdbyid/{rollno}")
	public Student getById(@PathVariable int rollno)
	{
		return stdService.getstdId(rollno);
	}
	
	@GetMapping("/getstdbyname/{name}")
	public Student getByname(@PathVariable String name)
	{
		return stdService.getByName(name);
	}
	
	@PutMapping("updatestd/{rollno}")
	public Student update(@PathVariable int rollno, @RequestBody Student s1)
	{
		return stdService.updatestd(rollno, s1);
	}
	
	@DeleteMapping("/delete/{rollno}")
	public void delstd(@PathVariable int rollno)
	{
		stdService.deletestd(rollno);
	}


}
