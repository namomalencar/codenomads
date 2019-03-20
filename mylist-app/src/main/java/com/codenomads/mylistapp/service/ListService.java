package com.codenomads.mylistapp.service;

import org.springframework.stereotype.Service;

import com.codenomads.mylistapp.domain.ListDomain;
import com.codenomads.mylistapp.repository.ListRepository;

@Service
public class ListService extends GenericService<ListRepository, ListDomain, Long> {

}
