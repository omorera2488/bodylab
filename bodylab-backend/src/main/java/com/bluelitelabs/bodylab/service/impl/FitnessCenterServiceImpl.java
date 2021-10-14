package com.bluelitelabs.bodylab.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluelitelabs.bodylab.model.FitnessCenter;
import com.bluelitelabs.bodylab.repo.IFitnessCenterRepo;
import com.bluelitelabs.bodylab.service.IFitnessCenterService;

@Service
public class FitnessCenterServiceImpl implements IFitnessCenterService {

	@Autowired
	private IFitnessCenterRepo fitnessCenterRepository;

	@Override
	public FitnessCenter register(FitnessCenter fitnessCenter) {
		return fitnessCenterRepository.save(fitnessCenter);
	}

	@Override
	public FitnessCenter update(FitnessCenter fitnessCenter) {
		return fitnessCenterRepository.save(fitnessCenter);
	}

	@Override
	public List<FitnessCenter> listAll() {
		return fitnessCenterRepository.findAll();
	}

	@Override
	public FitnessCenter getById(Integer id) {
		Optional<FitnessCenter> opt = fitnessCenterRepository.findById(id);
		return opt.isPresent() ? opt.get() : new FitnessCenter();

	}

	@Override
	public boolean delete(Integer id) {
		fitnessCenterRepository.deleteById(id);
		return true;

	}
}
