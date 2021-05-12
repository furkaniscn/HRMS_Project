package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.JobPositions;

public interface JobPositionsService {
	List<JobPositions> getAll();

}
