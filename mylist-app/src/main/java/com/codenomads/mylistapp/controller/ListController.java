package com.codenomads.mylistapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codenomads.mylistapp.domain.ListDomain;
import com.codenomads.mylistapp.service.ListService;

@RestController
@RequestMapping(path = "/mylist", produces = MediaType.APPLICATION_JSON_VALUE)
public class ListController extends GenericController<ListService, ListDomain, Long> {

	@GetMapping(path = "/test}")
	public List<ListDomain> myTest() {
		List<ListDomain> test = new ArrayList<ListDomain>();
		test.add(new ListDomain("Test1"));
		test.add(new ListDomain("Test2"));
		return test;

	}

}
