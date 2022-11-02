package com.bluelitelabs.bodylab.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bluelitelabs.bodylab.exception.ModelNotFoundException;
import com.bluelitelabs.bodylab.model.FitnessCenter;
import com.bluelitelabs.bodylab.service.IFitnessCenterService;

@RestController
@RequestMapping("/fitnessCenters")
public class FitnessCenterController {

	@Autowired
	private IFitnessCenterService fitnessCenterService;

	@GetMapping
	public ResponseEntity<List<FitnessCenter>> listAll() {
		List<FitnessCenter> listOfFitnessCenters = this.fitnessCenterService.listAll();
		return new ResponseEntity<List<FitnessCenter>>(listOfFitnessCenters, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<FitnessCenter> getById(@PathVariable("id") Integer id) {
		FitnessCenter fitnessCenter = fitnessCenterService.getById(id);
		if (fitnessCenter.getFitnessCenterId() == null) {
			throw new ModelNotFoundException("ID no encontrado" + id);
		}
		return new ResponseEntity<FitnessCenter>(fitnessCenter, HttpStatus.OK);
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<FitnessCenter> register(@Valid @RequestBody FitnessCenter fitnessCenter) {
		FitnessCenter registeredfitnessCenterObject = fitnessCenterService.register(fitnessCenter);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(registeredfitnessCenterObject.getFitnessCenterId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@PutMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<FitnessCenter> update(@Valid @RequestBody FitnessCenter fitnessCenter) {
		FitnessCenter updatedFitnessCenter = fitnessCenterService.update(fitnessCenter);
		return new ResponseEntity<FitnessCenter>(updatedFitnessCenter, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") Integer id) {
		fitnessCenterService.delete(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
}
