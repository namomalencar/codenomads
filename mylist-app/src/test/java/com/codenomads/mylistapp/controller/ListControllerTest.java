package com.codenomads.mylistapp.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.codenomads.mylistapp.domain.ListDomain;
import com.codenomads.mylistapp.repository.ListRepository;
import com.codenomads.mylistapp.service.ListService;

public class ListControllerTest extends GenericController<ListService, ListDomain, Long>{

	@Mock
	ListRepository repoList;

	private ListController listContr;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	@Ignore
	public void shouldSaveANewList() throws Exception {
		// scenario
		ListDomain myList = new ListDomain("My New List");

		// action
		ListDomain result = listContr.save(myList);

		// validation
		assertTrue(result.getNameList().equals(myList.getNameList()));
	}


}
