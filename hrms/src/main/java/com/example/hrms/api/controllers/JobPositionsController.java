package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobPositionsService;
import com.example.hrms.entities.concretes.JobPositions;

@RestController
@RequestMapping("api/job_positions")

public class JobPositionsController {

	private final JobPositionsService jobPositionsService;

	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}

	@GetMapping("/getall")
	public List<JobPositions> getAll() {
		return this.jobPositionsService.getAll();
	}

}
