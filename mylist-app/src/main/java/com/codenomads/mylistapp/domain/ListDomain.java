package com.codenomads.mylistapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class ListDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, max = 255)
	@Column(unique = true)
	private String name;

	@NotNull
	private LocalDate dateList;

	@OneToMany(mappedBy = "myList", cascade = CascadeType.ALL)
	private List<TaskDomain> taks;

	public ListDomain(String name, LocalDate dateList) {
		this.name = name;
		this.dateList = dateList;
	}

	public ListDomain() {
		this.dateList = LocalDate.now();
	}

}
