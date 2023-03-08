package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Hospital;
import com.example.demo.Service.HospitalSer;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class HospitalCon {
	@Autowired
	private HospitalSer hs;

	@PostMapping("/add")
	public Hospital addDetails(@RequestBody Hospital h) {
		return hs.addDetails(h);
	}

	@GetMapping("/get")
	public List<Hospital> getDetails() {
		return hs.getDetails();
	}

	@DeleteMapping("/del/{id}")
	public void delDetails(@PathVariable("id") int id) {
		hs.delDetails(id);
	}

	@PutMapping("/add/{id}")
	public Hospital update(@PathVariable("id") int id, @RequestBody Hospital h) {
		return hs.update(id, h);
	}
	
	@GetMapping("/get/{id}")
	public Hospital getById(@PathVariable("id") int id) {
		return hs.getById(id);
	}

}
