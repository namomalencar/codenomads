package com.codenomads.mylistapp.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.codenomads.mylistapp.domain.ListDomain;
import com.codenomads.mylistapp.repository.ListRepository;

@Service
@Transactional
public class ListService extends GenericService<ListRepository, ListDomain, Long> {

}
