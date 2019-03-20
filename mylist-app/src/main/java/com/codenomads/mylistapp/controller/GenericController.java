package com.codenomads.mylistapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.codenomads.mylistapp.service.GenericService;

/**
 * Generic Controller with common methods to accelerate the creation of
 * controller.
 * 
 * @author Namom Alencar {@literal <namomalencar@gmail.com>}
 * @version 1.0.0
 * @since 1.0.0
 *
 * @param <S> Service
 * @param <E> Entity
 * @param <PK> Primary key
 */
public class GenericController<S extends GenericService<? extends JpaRepository<E, PK>, E, PK>, E, PK> {

	@Autowired
	protected S service;

	@GetMapping
	public List<E> findAll() throws Exception {
		return service.findAll();
	}

	@GetMapping(path = "/id/{id}")
	public E findById(@PathVariable PK id) throws Exception {
		return service.findById(id);
	}

	@PostMapping
	protected E save(E object) throws Exception {
		return service.save(object);
	}

	@DeleteMapping
	public void delete(@RequestBody PK object) throws Exception {
		this.delete((PK) object);
	}

}
