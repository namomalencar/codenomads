package com.codenomads.mylistapp.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class TaskDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private LocalDate dateTask;

	private Boolean status;

	@ManyToOne
	@JoinColumn(name = "id_list")
	private ListDomain myList;

	public TaskDomain(String name, ListDomain myList) {
		this.name = name;
		this.dateTask = LocalDate.now();
		this.status = true;
		this.myList = myList;
	}

	public TaskDomain() {
	}

}
