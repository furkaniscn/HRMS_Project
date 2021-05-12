package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobPositionsService;
import com.example.hrms.dataAccess.abstracts.JobPositionsDao;
import com.example.hrms.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService {

	private JobPositionsDao jobPositionsDao;

	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}
	


	@Override
	public List<JobPositions> getAll() {

		return this.jobPositionsDao.findAll();
	}

}
