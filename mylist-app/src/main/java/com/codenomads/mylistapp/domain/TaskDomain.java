package com.codenomads.mylistapp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class TaskDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalDateTime dateTask;

	private Boolean status;

	@ManyToOne
	@JoinColumn(name = "id_list")
	private ListDomain myList;

	public TaskDomain(String name, ListDomain myList) {
		this.name = name;
		this.dateTask = LocalDateTime.now();
		this.status = true;
		this.myList = myList;
	}

	public TaskDomain() {
	}

}
