package com.bluelitelabs.bodylab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluelitelabs.bodylab.model.FitnessCenter;

public interface IFitnessCenterRepo extends JpaRepository<FitnessCenter, Integer> {

}
