package com.codenomads.mylistapp.controller;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codenomads.mylistapp.domain.ListDomain;
import com.codenomads.mylistapp.service.ListService;

@RestController
@RequestMapping(path = "/mylist", produces = MediaType.APPLICATION_JSON_VALUE)
public class ListController extends GenericController<ListService, ListDomain, Long> {

	@GetMapping(path = "/generate")
	public List<ListDomain> generate() {
		this.getStreamFromFile(Paths.get("").toAbsolutePath().normalize().toString() + "//verbs.txt").forEach(name -> {
			try {
				this.save(new ListDomain(name, this.generateDate()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		return service.findAll();
	}

	private LocalDate generateDate() {
		return LocalDate.now().plus(new Random().nextInt(500), ChronoUnit.DAYS);
	}

	private Stream<String> getStreamFromFile(String fileName) {
		Stream<String> stream = null;
		try {
			stream = Files.lines(Paths.get(fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stream;
	}

}
